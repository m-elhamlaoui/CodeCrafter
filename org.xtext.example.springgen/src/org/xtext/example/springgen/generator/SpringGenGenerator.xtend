/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.springgen.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.example.springgen.springgen.SpringBootProject
import org.xtext.example.springgen.springgen.ProjectConfiguration
import org.xtext.example.springgen.springgen.ServerConfiguration
import org.xtext.example.springgen.springgen.DatabaseConfiguration
import org.xtext.example.springgen.springgen.Entity
import org.xtext.example.springgen.springgen.EntityRelationship
import org.xtext.example.springgen.springgen.ProjectElement
import org.xtext.example.springgen.springgen.DTO
import org.xtext.example.springgen.springgen.Service
import org.xtext.example.springgen.springgen.Controller
import org.xtext.example.springgen.springgen.ServiceAction
import org.xtext.example.springgen.springgen.CustomAction
import org.xtext.example.springgen.springgen.ActionParameter
import org.xtext.example.springgen.springgen.Repository
import org.xtext.example.springgen.springgen.FindByMethod
import org.xtext.example.springgen.springgen.DeleteByMethod
import org.xtext.example.springgen.springgen.CustomQueryMethod
import org.xtext.example.springgen.springgen.Property
import org.xtext.example.springgen.springgen.Type
import org.xtext.example.springgen.springgen.ReturnType
import org.xtext.example.springgen.springgen.ListType
import org.xtext.example.springgen.springgen.SetType
import org.xtext.example.springgen.springgen.ValueTypes
import org.xtext.example.springgen.springgen.HttpMethods
import org.xtext.example.springgen.springgen.RDBMS
import org.xtext.example.springgen.springgen.DatabaseRelations
import org.xtext.example.springgen.springgen.ParamTransfer
import java.util.ArrayList

/**
 * Generates code from your model files on save.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SpringGenGenerator extends AbstractGenerator {

    override void beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
        // Perform any pre-generation tasks here
    }

    override void doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
        input.allContents.forEach[ element |
            if (element instanceof Entity) {
                val idType = if (element.identifier !== null) {
                    extractValueType(element.identifier.type.toString())
                } else {
                    'int'
                }
                val idName = if (element.identifier !== null) {
                    element.identifier.name.toString()
                } else {
                    'Id'
                }

                generateEntityClass(element as Entity, fsa, input, idType, idName)
                if (element.repository !== null) {
                    generateRepository(element, fsa, input, idType)
                }
                generateService(element, fsa, input)
                generateController(element, fsa, input)
            }
        ]

        input.allContents.forEach[ element |
            if (element instanceof DTO) {
                generateDtoClass(element as DTO, fsa, input)
            }
        ]

        val projectNameHolder = new ArrayList<String>()
        input.allContents.forEach[ element |
            if (element instanceof SpringBootProject) {
                projectNameHolder.add(element.name)
            }
        ]
        val projectName = projectNameHolder.get(0)

        val configHolder = new ArrayList<ProjectConfiguration>()
        input.allContents.forEach[ element |
            if (element instanceof SpringBootProject) {
                configHolder.add(element.configuration)
            }
        ]
        val config = configHolder.get(0)

        generateMainClass(fsa, input, config)
        generateMavenFiles(fsa, input)
        generateTestFolder(fsa, input)

        if (config !== null) {
            generatePropertiesFile(config, fsa)
            val dbmsType = config.database?.type?.toString ?: "mysql"

            switch (config.database.type) {
                case "h2":
                    generatePropertiesH2(config, fsa)
                case "oracle":
                    generatePropertiesOracle(config, fsa)
                default:
                    generatePropertiesFile(config, fsa)
            }
        }
        generatePomXml(config, fsa, projectName)
    }

    def void generateController(Entity entity, IFileSystemAccess2 fsa, Resource input) {
        val projectNameHolder = new ArrayList<String>()
        input.allContents.forEach[ element |
            if (element instanceof SpringBootProject) {
                projectNameHolder.add(element.name)
            }
        ]
        val projectName = projectNameHolder.get(0)
        val className = entity.name

        val content = '''
            package com.springboot.«projectName».controllers;

            import org.springframework.stereotype.Service;
            import com.springboot.«projectName».entities.«className»;
            import com.springboot.«projectName».services.«className.toFirstUpper»Service;
            import org.springframework.beans.factory.annotation.Autowired;
            import org.springframework.web.bind.annotation.*;
            import java.util.*;
            import org.springframework.http.*;

            @RestController
            @RequestMapping("«IF entity.controller.baseUrl !== null»«entity.controller.baseUrl»«ELSE»/api/«className.toFirstUpper» «ENDIF»")
            public class «className.toFirstUpper»Controller {
                @Autowired
                private final «className.toFirstUpper»Service «className.toFirstLower»Service;

                «IF entity.controller.deleteParam !== null»«generateDeleteMethodController(entity)» «ENDIF»
                «IF entity.controller.findParam !== null»«generateFindMethodController(entity)» «ENDIF»
                «IF entity.controller.createParam !== null»«generateSaveMethodController(entity)» «ENDIF»

                @GetMapping("/deleteAll")
                public ResponseEntity<String> deleteAll«className.toFirstUpper»s() {
                    return «className.toFirstLower»Service.deleteAll«className.toFirstUpper»s();
                }
                @GetMapping("/findAll")
                public List<«className»> findAll«className.toFirstUpper»s() {
                    return «className.toFirstLower»Service.findAll«className.toFirstUpper»s();
                }
        '''

        fsa.generateFile("src/main/java/com/springboot/" + projectName + "/controllers/" + className.toFirstUpper + "Controller.java", content)
    }

    def void generateService(Entity entity, IFileSystemAccess2 fsa, Resource input) {
        val projectNameHolder = new ArrayList<String>()
        input.allContents.forEach[ element |
            if (element instanceof SpringBootProject) {
                projectNameHolder.add(element.name)
            }
        ]
        val projectName = projectNameHolder.get(0)
        val className = entity.name

        val content = '''
            package com.springboot.«projectName».services;

            import org.springframework.stereotype.Service;
            import com.springboot.«projectName».entities.«className»;
            import com.springboot.«projectName».repositories.«className»Repository;
            import org.springframework.beans.factory.annotation.Autowired;
            import org.springframework.http.*;
            import org.springframework.web.bind.annotation.*;
            import java.util.*;

            @Service
            public class «className.toFirstUpper»Service {
                @Autowired
                private final «className»Repository «className»Repo;

                «IF entity.controller.deleteParam !== null»«generateDeleteMethod(entity)» «ENDIF»
                «IF entity.controller.findParam !== null»«generateFindMethod(entity)» «ENDIF»
                «IF entity.controller.createParam !== null»«generateSaveMethod(entity)» «ENDIF»

                public ResponseEntity<String> deleteAll«className.toFirstUpper»s() {
                    «className»Repo.deleteAll«className.toFirstUpper»s();
                    return new ResponseEntity<String>("all «className.toFirstUpper» was deleted from database", null, HttpStatus.OK);
                }

                public List<«className»> findAll«className.toFirstUpper»s() {
                    return «className»Repo.findAll();
                }
            }
        '''

        fsa.generateFile("src/main/java/com/springboot/" + projectName + "/services/" + className.toFirstUpper + "Service.java", content)
    }

    def String generateFindMethod(Entity entity) {
        val findContent = '''
            public «entity.name» find«entity.name.toFirstUpper»( «extractValueType(entity.identifier.type.toString())» id) {
                return «entity.name»Repo.findById(id);
            }
        '''
        findContent
    }

    def String generateSaveMethod(Entity entity) {
        val saveContent = '''
            public void save«entity.name.toFirstUpper»( «entity.name» element) {
                «entity.name»Repo.save(element);
            }
        '''
        saveContent
    }

    def String generateDeleteMethod(Entity entity) {
        val deleteContent = '''
            public ResponseEntity<String> delete«entity.name.toFirstUpper»(«extractValueType(entity.identifier.type.toString())» id ) {
                if («entity.name»Repo.isEmpty()) {
                    return new ResponseEntity<String>("No «entity.name.toFirstUpper» with this id ", null, HttpStatus.OK);
                }
                return new ResponseEntity<String>("«entity.name.toFirstUpper» deleted successfully", null, HttpStatus.OK);
            }
        '''
        deleteContent
    }

    def String generateFindMethodController(Entity entity) {
        val findContent = '''
            @GetMapping("/findById")
            public «entity.name» find«entity.name.toFirstUpper»(@RequestParam «extractValueType(entity.identifier.type.toString())» id) {
                return «entity.name»Service.find«entity.name.toFirstUpper»(id);
            }
        '''
        findContent
    }

    def String generateSaveMethodController(Entity entity) {
        val saveContent = '''
            @PostMapping("save«entity.name.toFirstUpper»")
            public ResponseEntity<String> save«entity.name.toFirstUpper»(@RequestBody «entity.name» element) {
                return «entity.name»Service.save(element);
            }
        '''
        saveContent
    }

    def String generateDeleteMethodController(Entity entity) {
        val deleteContent = '''
            @DeleteMapping("/delete«entity.name.toFirstUpper»ById")
            public ResponseEntity<String> delete«entity.name.toFirstUpper»(«extractValueType(entity.identifier.type.toString())» id ) {
                return «entity.name.toFirstUpper»Repository.deleteById(id);
            }
        '''
        deleteContent
    }

    def getHibernateDialect(String dbmsType) {
        switch (dbmsType) {
            case "Mysql": return "org.hibernate.dialect.MySQL5Dialect"
            case "Postgres": return "org.hibernate.dialect.PostgreSQLDialect"
            case "Mariadb": return "org.hibernate.dialect.MariaDBDialect"
            case "h2": return "org.hibernate.dialect.H2Dialect"
            case "Oracle": return "org.hibernate.dialect.Oracle12cDialect"
            default: return "org.hibernate.dialect.MySQL5Dialect"
        }
    }

    def generatePomXml(ProjectConfiguration config, IFileSystemAccess2 fsa, String prjName) {
        val pomContent = '''
            <?xml version="1.0" encoding="UTF-8"?>
            <project xmlns="http://maven.apache.org/POM/4.0.0"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
                <modelVersion>4.0.0</modelVersion>
                <parent>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-parent</artifactId>
                    <version>2.5.0</version>
                    <relativePath/>
                </parent>
                <groupId>com.springboot</groupId>
                <artifactId>«prjName»</artifactId>
                <version>0.0.1-SNAPSHOT</version>
                <name>«prjName»</name>
                <description>Demo project for Spring Boot</description>
                <properties>
                    <java.version>17</java.version>
                </properties>
                <dependencies>
                    <dependency>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-starter-data-jpa</artifactId>
                    </dependency>
                    <dependency>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-starter-web</artifactId>
                    </dependency>
                    <dependency>
                        <groupId>org.projectlombok</groupId>
                        <artifactId>lombok</artifactId>
                        <optional>true</optional>
                    </dependency>
                    <dependency>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-starter-test</artifactId>
                        <scope>test</scope>
                    </dependency>
                    «generateDatabaseDependencies(config.database?.type.toString)»
                </dependencies>
                <build>
                    <plugins>
                        <plugin>
                            <groupId>org.springframework.boot</groupId>
                            <artifactId>spring-boot-maven-plugin</artifactId>
                            <configuration>
                                <excludes>
                                    <exclude>
                                        <groupId>org.projectlombok</groupId>
                                        <artifactId>lombok</artifactId>
                                    </exclude>
                                </excludes>
                            </configuration>
                        </plugin>
                    </plugins>
                </build>
            </project>
        '''

        fsa.generateFile("pom.xml", pomContent)
    }

    def generateDatabaseDependencies(String dbmsType) {
        switch (dbmsType) {
            case "Mysql":
                return '''
                    <dependency>
                        <groupId>com.mysql</groupId>
                        <artifactId>mysql-connector-j</artifactId>
                        <scope>runtime</scope>
                    </dependency>
                '''
            case "Postgres":
                return '''
                    <dependency>
                        <groupId>org.postgresql</groupId>
                        <artifactId>postgresql</artifactId>
                        <scope>runtime</scope>
                    </dependency>
                '''
            case "Mariadb":
                return '''
                    <dependency>
                        <groupId>org.mariadb.jdbc</groupId>
                        <artifactId>mariadb-java-client</artifactId>
                        <scope>runtime</scope>
                    </dependency>
                '''
            case "Oracle":
                return '''
                    <dependency>
                        <groupId>com.oracle.database.jdbc</groupId>
                        <artifactId>ojdbc11</artifactId>
                        <scope>runtime</scope>
                    </dependency>
                '''
            case "h2":
                return '''
                    <dependency>
                        <groupId>com.h2database</groupId>
                        <artifactId>h2</artifactId>
                        <scope>runtime</scope>
                    </dependency>
                '''
            default:
                return ''
        }
    }

    def void generatePropertiesH2(ProjectConfiguration config, IFileSystemAccess2 fsa) {
        val propertiesContent = '''
            # Server Configuration
            server.port = «(config.server == null || config.server.port == 0) ? 8080 : config.server.port»
            server.cpath = «config.server?.contextPath ?: "/api"»

            # Database Configuration
            spring.datasource.url = jdbc:«config.database?.type ?: "h2"»:mem:«config.database?.name ?: "dbname"»
            spring.datasource.username = «config.database?.username ?: "root"»
            spring.datasource.password = «config.database?.password ?: "password"»

            # Hibernate Configuration
            spring.jpa.hibernate.ddl-auto = update
            spring.jpa.show-sql = true
            spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.«getHibernateDialect(config.database?.type.toString)»
        '''
        val pomFilePath = "src/main/resources/application.properties"
        fsa.generateFile(pomFilePath, propertiesContent)
    }

    def void generatePropertiesOracle(ProjectConfiguration config, IFileSystemAccess2 fsa) {
        val propertiesContent = '''
            # Server Configuration
            server.port = «(config.server == null || config.server.port == 0) ? 8080 : config.server.port»
            server.cpath = «config.server?.contextPath ?: "/api"»

            # Database Configuration
            spring.datasource.url = jdbc:oracle:thin:@localhost:«(config.database == null || config.database.port == 0) ? 1521 : config.database.port»/«config.database?.name ?: "dbname"»
            spring.datasource.username = «config.database?.username ?: "root"»
            spring.datasource.password = «config.database?.password ?: "password"»

            # Hibernate Configuration
            spring.jpa.hibernate.ddl-auto = update
            spring.jpa.show-sql = true
            spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.«getHibernateDialect(config.database?.type.toString)»
        '''
        val pomFilePath = "src/main/resources/application.properties"
        fsa.generateFile(pomFilePath, propertiesContent)
    }

    def void generatePropertiesFile(ProjectConfiguration config, IFileSystemAccess2 fsa) {
        val propertiesContent = '''
            # Server Configuration
            server.port = «(config.server == null || config.server.port == 0) ? 8080 : config.server.port»
            server.cpath = «config.server?.contextPath ?: "/api"»

            # Database Configuration
            spring.datasource.url = jdbc:«config.database?.type ?: "mysql"»://localhost:«(config.database == null || config.database.port == 0) ? 3306 : config.database.port»/«config.database?.name ?: "dbname"»
            spring.datasource.username = «config.database?.username ?: "root"»
            spring.datasource.password = «config.database?.password ?: "password"»

            # Hibernate Configuration
            spring.jpa.hibernate.ddl-auto = update
            spring.jpa.show-sql = true
            spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.«getHibernateDialect(config.database?.type.toString)»
        '''
        val pomFilePath = "src/main/resources/application.properties"
        fsa.generateFile(pomFilePath, propertiesContent)
    }

    def void generateMavenFiles(IFileSystemAccess2 fsa, Resource input) {
        val pomContent = '''
            distributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.5/apache-maven-3.9.5-bin.zip
            wrapperUrl=https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.2.0/maven-wrapper-3.2.0.jar
        '''
        val pomFilePath = "mvn/wrapper/maven-wrapper.properties"
        fsa.generateFile(pomFilePath, pomContent)
    }

    def String extractValueType(String typeString) {
        val parts = typeString.split("\\s+")
        val vtypesPart = parts.last
        return vtypesPart.substring(0, vtypesPart.length() - 1)
    }

    def generateTestFolder(IFileSystemAccess2 fsa, Resource input) {
        val projectNameHolder = new ArrayList<String>()
        input.allContents.forEach[ element |
            if (element instanceof SpringBootProject) {
                projectNameHolder.add(element.name)
            }
        ]
        val projectName = projectNameHolder.get(0)
        val content2 = '''
            package com.springboot.«projectName»;

            import org.junit.jupiter.api.Test;
            import org.springframework.boot.test.context.SpringBootTest;

            @SpringBootTest
            class «projectName.toFirstUpper»ApplicationTests {

                @Test
                void contextLoads() {
                }
            }
        '''

        val fpath = "src/test/java/com/springboot/" + projectName + "/" + projectName.toFirstUpper + "ApplicationTests.java"
        fsa.generateFile(fpath, content2)
    }

    def generateMainClass(IFileSystemAccess2 fsa, Resource input, ProjectConfiguration configuration) {
        val projectNameHolder = new ArrayList<String>()
        input.allContents.forEach[ element |
            if (element instanceof SpringBootProject) {
                projectNameHolder.add(element.name)
            }
        ]
        val projectName = projectNameHolder.get(0)
        val content2 = '''
            package com.springboot.«projectName».«configuration.database.type»;

            import org.springframework.boot.SpringApplication;
            import org.springframework.boot.autoconfigure.SpringBootApplication;

            @SpringBootApplication
            public class «projectName.toFirstUpper»Application {

                public static void main(String[] args) {
                    SpringApplication.run(«projectName.toFirstUpper»Application.class, args);
                }
            }
        '''

        val fpath = "src/main/java/com/springboot/" + projectName + "/" + projectName.toFirstUpper + "Application.java"
        fsa.generateFile(fpath, content2)
    }

    def String getSimpleTypeName(Type type) {
        if (type instanceof ListType) {
            return "List<" + getSimpleTypeName(type.type) + ">"
        } else if (type instanceof SetType) {
            return "Set<" + getSimpleTypeName(type.type) + ">"
        } else if (type instanceof ValueTypes) {
            return type.toString
        } else {
            return extractValueType(type.toString())
        }
    }

    def generateDtoClass(DTO dto, IFileSystemAccess2 fsa, Resource input) {
        val projectNameHolder = new ArrayList<String>()
        input.allContents.forEach[ element |
            if (element instanceof SpringBootProject) {
                projectNameHolder.add(element.name)
            }
        ]
        val projectName = projectNameHolder.get(0)
        val className = dto.name
        val properties = dto.properties

        val content = '''
            package com.springboot.«projectName».DTO;
            import lombok.*;
            import java.util.*;

            @Builder
            public class «className» {
                «FOR property : properties»
                    private «getSimpleTypeName(property.type)» «property.name»;
                «ENDFOR»

                «FOR property : properties»
                    public «getSimpleTypeName(property.type)» get«property.name.toFirstUpper»() {
                        return «property.name»;
                    }

                    public void set«property.name.toFirstUpper»(«getSimpleTypeName(property.type)» «property.name») {
                        this.«property.name» = «property.name»;
                    }
                «ENDFOR»
            }
        '''

        val folderPath = "src/main/java/com/springboot/" + projectName + "/DTO"
        val filePath = folderPath + "/" + className + ".java"

        fsa.generateFile(filePath, content)
    }

    def generateRepository(Entity entity, IFileSystemAccess2 fsa, Resource input, String idType) {
        val projectNameHolder = new ArrayList<String>()
        input.allContents.forEach[ element |
            if (element instanceof SpringBootProject) {
                projectNameHolder.add(element.name)
            }
        ]
        val projectName = projectNameHolder.get(0)
        val className = entity.name

        val content = '''
            package com.springboot.«projectName».repository;

            import lombok.*;
            import java.util.*;
            import org.springframework.data.jpa.repository.JpaRepository;
            import org.springframework.stereotype.Repository;
            import com.springboot.«projectName».entities.«className»;

            @Repository
            public interface «className»Repository extends JpaRepository<«className», «idType»> {
                «FOR method : entity.repository.findBy»
                    List<«entity.name»> findBy«method.property.toFirstUpper»(«extractValueType(method.propertyType.toString())» «method.property»);
                «ENDFOR»

                «FOR method : entity.repository.deleteBy»
                    void deleteBy«method.property.toFirstUpper»(«extractValueType(method.propertyType.toString())» «method.property»);
                «ENDFOR»

                «FOR method : entity.repository.customQueryMethod»
                    «method.query»
                «ENDFOR»
            }
        '''

        val folderPath = "src/main/java/com/springboot/" + projectName + "/repositories"
        val filePath = folderPath + "/" + className + ".java"

        fsa.generateFile(filePath, content)
    }

    def generateEntityClass(Entity entity, IFileSystemAccess2 fsa, Resource input, String idType, String idName) {
        val projectNameHolder = new ArrayList<String>()
        input.allContents.forEach[ element |
            if (element instanceof SpringBootProject) {
                projectNameHolder.add(element.name)
            }
        ]
        val projectName = projectNameHolder.get(0)
        val className = entity.name
        val properties = entity.properties
        val extendsClause = entity.extends

        val content = '''
            package com.springboot.«projectName».entities;

            import jakarta.persistence.Entity;
            import jakarta.persistence.Table;
            import lombok.*;
            import java.util.*;

            @Entity
            @Table(name = "«className»")
            @Builder
            public class «className» «IF extendsClause !== null»extends «extendsClause» «ENDIF»{
                @Id
                private «idType» «idName»;
                «FOR property : properties»
                    private «getSimpleTypeName(property.type)» «property.name»;
                «ENDFOR»

                public «idType» get«idName.toFirstUpper»() {
                    return «idName»;
                }

                «FOR property : properties»
                    public «getSimpleTypeName(property.type)» get«property.name.toFirstUpper»() {
                        return «property.name»;
                    }

                    public void set«property.name.toFirstUpper»(«getSimpleTypeName(property.type)» «property.name») {
                        this.«property.name» = «property.name»;
                    }
                «ENDFOR»
            }
        '''

        val folderPath = "src/main/java/com/springboot/" + projectName + "/entities"
        val filePath = folderPath + "/" + className + ".java"

        fsa.generateFile(filePath, content)
    }
}
