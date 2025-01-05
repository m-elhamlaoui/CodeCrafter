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
}