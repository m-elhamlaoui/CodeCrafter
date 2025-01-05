package org.xtext.example.springgen.validation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.validation.Check;
import org.xtext.example.springgen.springgen.Entity;
import org.xtext.example.springgen.springgen.EntityRelationship;
import org.xtext.example.springgen.springgen.ProjectConfiguration;
import org.xtext.example.springgen.springgen.Property;
import org.xtext.example.springgen.springgen.ServerConfiguration;
import org.xtext.example.springgen.springgen.Service;
import org.xtext.example.springgen.springgen.ServiceAction;
import org.xtext.example.springgen.springgen.SpringgenPackage;
import org.xtext.example.springgen.springgen.Controller;
import org.xtext.example.springgen.springgen.DatabaseConfiguration;
import org.xtext.example.springgen.springgen.ProjectElement;
import org.xtext.example.springgen.springgen.Dockerfile;
import org.xtext.example.springgen.springgen.BaseImage;
import org.xtext.example.springgen.springgen.DockerInstruction;
import org.xtext.example.springgen.springgen.RunInstruction;
import org.xtext.example.springgen.springgen.CopyInstruction;
import org.xtext.example.springgen.springgen.ExposeInstruction;
import org.xtext.example.springgen.springgen.EnvInstruction;
import org.xtext.example.springgen.springgen.WorkdirInstruction;
import org.xtext.example.springgen.springgen.CmdInstruction;
import org.xtext.example.springgen.springgen.AngularApp;
import org.xtext.example.springgen.springgen.AngularComponent;
import org.xtext.example.springgen.springgen.AngularService;
import org.xtext.example.springgen.springgen.AngularServiceMethod;
import org.xtext.example.springgen.springgen.AngularModule;
import org.xtext.example.springgen.springgen.AngularModuleImport;

public class SpringGenValidator extends AbstractSpringGenValidator {

    // Check if entity name starts with a capital letter
    @Check
    public void checkEntityNameStartsWithCapital(Entity entity) {
        if (Character.isLowerCase(entity.getName().charAt(0))) {
            warning("Entity name should start with a capital", null);
        }
    }

    // Check if a ProjectElement has at least one Property
    @Check
    public void entityMustContainAtLeastOneAttribute(Entity entity) {
        if (entity.getProperties().isEmpty()) {
            warning("Entity must have at least one attribute", null);
        }
    }

    // Check for cycles in entity hierarchy (extends)
    @Check
    public void checkNoCycleInEntityHierarchy(Entity entity) {
        HashSet<Entity> visitedEntities = new HashSet<>();
        Entity current = entity.getExtends();
        while (current != null) {
            if (visitedEntities.contains(current)) {
                error("Cycle in hierarchy of entity " + current.getName(), null);
                return;
            }
            visitedEntities.add(current);
            current = current.getExtends();
        }
    }

    // Check if EntityRelationship has a valid source and target
    @Check
    public void relationshipValidation(EntityRelationship relationship) {
        if (relationship.getSource() == null || relationship.getTarget() == null) {
            warning("Relationship requires a source and a target", null);
        }
        if (relationship.getSource() == relationship.getTarget()) {
            error("Relationship source and target must be different", null);
        }
    }

    // Check for duplicate property names within an Entity
    @Check
    public void checkUniquePropertyNames(Entity entity) {
        Set<String> propertyNames = new HashSet<>();
        for (Property property : entity.getProperties()) {
            if (!propertyNames.add(property.getName())) {
                error("Duplicate property name within the entity", null);
            }
        }
    }

    // Check for duplicate service action names within a Service
    @Check
    public void checkUniqueServiceActionNames(Service service) {
        Set<String> actionNames = new HashSet<>();
        for (ServiceAction action : service.getActions()) {
            if (!actionNames.add(action.getName())) {
                error("Duplicate service action name within the service", null);
            }
        }
    }

    // Ensure ServerConfiguration has a valid port
    @Check
    public void checkValidServerPort(ServerConfiguration server) {
        if (server.getPort() < 1 || server.getPort() > 65535) {
            error("Invalid server port, must be in the range 1-65535", null);
        }
    }

    // Ensure DatabaseConfiguration has a valid port
    @Check
    public void checkValidDatabasePort(DatabaseConfiguration database) {
        if (database.getPort() < 1 || database.getPort() > 65535) {
            error("Invalid database port, must be in the range 1-65535", null);
        }
    }

    // Ensure ProjectConfiguration is properly defined
    @Check
    public void checkProjectConfiguration(ProjectConfiguration projectConfig) {
        if (projectConfig.getServer() == null || projectConfig.getDatabase() == null) {
            warning("ProjectConfiguration requires both server and database configurations", null);
        }
    }

    // Check if controller name starts with a capital letter
    @Check
    public void checkControllerNameStartsWithCapital(Controller controller) {
        if (Character.isLowerCase(controller.getBaseUrl().charAt(0))) {
            warning("Controller name should start with a capital", null);
        }
    }

    // Check if Dockerfile has a base image
    @Check
    public void checkDockerfileBaseImage(Dockerfile dockerfile) {
        if (dockerfile.getBaseImage() == null) {
            error("Dockerfile must have a base image", null);
        }
    }

    // Check if Dockerfile instructions are valid
    @Check
    public void checkDockerfileInstructions(Dockerfile dockerfile) {
        for (DockerInstruction instruction : dockerfile.getInstructions()) {
            if (instruction instanceof RunInstruction) {
                RunInstruction runInstruction = (RunInstruction) instruction;
                if (runInstruction.getCommand() == null || runInstruction.getCommand().isEmpty()) {
                    error("RUN instruction must have a command", null);
                }
            } else if (instruction instanceof CopyInstruction) {
                CopyInstruction copyInstruction = (CopyInstruction) instruction;
                if (copyInstruction.getSource() == null || copyInstruction.getSource().isEmpty() ||
                    copyInstruction.getTarget() == null || copyInstruction.getTarget().isEmpty()) {
                    error("COPY instruction must have a source and target", null);
                }
            } else if (instruction instanceof ExposeInstruction) {
                ExposeInstruction exposeInstruction = (ExposeInstruction) instruction;
                if (exposeInstruction.getPort() < 1 || exposeInstruction.getPort() > 65535) {
                    error("EXPOSE instruction must have a valid port in the range 1-65535", null);
                }
            } else if (instruction instanceof EnvInstruction) {
                EnvInstruction envInstruction = (EnvInstruction) instruction;
                if (envInstruction.getKey() == null || envInstruction.getKey().isEmpty() ||
                    envInstruction.getValue() == null || envInstruction.getValue().isEmpty()) {
                    error("ENV instruction must have a key and value", null);
                }
            } else if (instruction instanceof WorkdirInstruction) {
                WorkdirInstruction workdirInstruction = (WorkdirInstruction) instruction;
                if (workdirInstruction.getPath() == null || workdirInstruction.getPath().isEmpty()) {
                    error("WORKDIR instruction must have a path", null);
                }
            } else if (instruction instanceof CmdInstruction) {
                CmdInstruction cmdInstruction = (CmdInstruction) instruction;
                if (cmdInstruction.getCommand() == null || cmdInstruction.getCommand().isEmpty()) {
                    error("CMD instruction must have a command", null);
                }
            }
        }
    }

    // Check if Angular component name starts with a capital letter
    @Check
    public void checkAngularComponentNameStartsWithCapital(AngularComponent component) {
        if (Character.isLowerCase(component.getName().charAt(0))) {
            warning("Angular component name should start with a capital", null);
        }
    }

    // Check if Angular service name starts with a capital letter
    @Check
    public void checkAngularServiceNameStartsWithCapital(AngularService service) {
        if (Character.isLowerCase(service.getName().charAt(0))) {
            warning("Angular service name should start with a capital", null);
        }
    }

    // Check for duplicate service method names within an Angular service
    @Check
    public void checkUniqueAngularServiceMethodNames(AngularService service) {
        Set<String> methodNames = new HashSet<>();
        for (AngularServiceMethod method : service.getMethods()) {
            if (!methodNames.add(method.getName())) {
                error("Duplicate service method name within the Angular service", null);
            }
        }
    }

    // Check if Angular module name starts with a capital letter
    @Check
    public void checkAngularModuleNameStartsWithCapital(AngularModule module) {
        if (Character.isLowerCase(module.getName().charAt(0))) {
            warning("Angular module name should start with a capital", null);
        }
    }

    // Check if Angular module has at least one declaration
    @Check
    public void checkAngularModuleHasDeclarations(AngularModule module) {
        if (module.getDeclarations().isEmpty()) {
            warning("Angular module must have at least one declaration", null);
        }
    }

    // Check if Angular module has at least one import
    @Check
    public void checkAngularModuleHasImports(AngularModule module) {
        if (module.getImports().isEmpty()) {
            warning("Angular module must have at least one import", null);
        }
    }
}
