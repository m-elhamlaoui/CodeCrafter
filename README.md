# SpringGen: A DSL for Automated Spring Boot and Dockerfile Generation

## Table of Contents
1. [Introduction](#introduction)  
2. [DSL Input](#dsl-input)  
3. [MetaModel Definition](#metamodel-definition)  
4. [Grammar Building](#grammar-building)  
5. [Generator](#generator)  
6. [Validation](#validation)  
7. [Setup and Installation](#setup-and-installation)  
8. [Usage](#usage)  
9. [Example Input](#example-input)  
10. [Output Files](#output-files)  
11. [Contributing](#contributing) 

---

## 1- Introduction

**SpringGen** is a Domain-Specific Language (DSL) designed to simplify the development of Spring Boot applications and Dockerfiles. By using **Model-Driven Engineering (MDE)** principles, SpringGen provides an expressive syntax that allows developers to define the structure, behavior, and configuration of their applications in a concise manner. 

With **SpringGen**, you can:
- Automatically generate **CRUD RESTful APIs** for entities.
- Create and manage DTOs, services, repositories, and controllers.
- Generate Dockerfiles for containerization.
- Focus on unique business logic while automating repetitive tasks.

SpringGen is powered by technologies like **Xtext**, **Xtend**, and **EMF**, ensuring seamless model-to-model and model-to-text transformations for a consistent development experience.

## 2- DSL Input

**SpringGen DSL** allows the definition of Spring Boot RESTful APIs and Dockerfiles through a concise and expressive syntax. The DSL encompasses various aspects of API development, including project configuration, entity modeling, Data Transfer Objects (DTOs), controllers, repositories, and custom actions.

 **Project Definition**

Define a Spring Boot project using the 'SpringBootProject' keyword, specifying the project name ('name') and optional configuration settings.

**Entity Modeling**

Entities are defined using the 'entity' keyword, specifying the entity name ('name'), identifier details, properties, repository, and controller.

**Data Transfer Objects (DTOs)**

DTOs are defined using the 'dto' keyword, specifying the DTO name ('name') and its properties.

**Controllers**

Controllers are defined using the 'controller' keyword, allowing the specification of base URLs, custom actions, and CRUD operations.

**Custom Actions**

Custom actions are defined using the 'service' keyword, providing details such as HTTP method, path, return type, implementation, and parameters.

**Repositories**

Repositories are defined using the 'repository' keyword, encompassing custom query methods, 'find by' methods, and 'delete by' methods.

**Configuration**

Configuration settings, including server and database details, are defined using the 'config' keyword.
 
**Data Types**

Various data types, including primitive types and enumerations, are supported.

**Relationships**

Entity relationships, such as Many-to-Many ('MANY_TO_MANY'), Many-to-One ('MANY_TO_ONE'), and One-to-Many ('ONE_TO_MANY'), can be specified.

 **HTTP Methods and Database Types**

HTTP methods ('GET', 'POST', 'PUT', 'DELETE', 'PATCH') and database types ('MariaDB', 'MYSQL', 'POSTGRES', 'H2', 'Oracle') are supported.

 **Parameter Transfer Types**

Different parameter transfer types, such as 'RequestBody', 'RequestParam', and 'PathVariable', are available for custom actions.

**Dockerfile**

Dockerfile instructions are defined using the 'dockerfile' keyword, allowing the specification of base image and various Docker instructions. The Dockerfile section includes the following instructions:

- **Base Image**: Specifies the base image for the Docker container using the 'FROM' keyword.
- **Run Instruction**: Executes commands in a new layer on top of the current image and commits the results using the 'RUN' keyword.
- **Copy Instruction**: Copies files or directories from the source path to the destination path in the container using the 'COPY' keyword.
- **Expose Instruction**: Informs Docker that the container listens on the specified network ports at runtime using the 'EXPOSE' keyword.
- **Env Instruction**: Sets environment variables using the 'ENV' keyword.
- **Workdir Instruction**: Sets the working directory for any RUN, CMD, ENTRYPOINT, COPY, and ADD instructions that follow it in the Dockerfile using the 'WORKDIR' keyword.
- **Cmd Instruction**: Provides defaults for an executing container using the 'CMD' keyword.

The DSL aims to provide a declarative and intuitive syntax for describing the structure and behavior of Spring Boot RESTful APIs and Dockerfiles, facilitating rapid development and easy customization. **SpringGen** is a DSL that aims to be intuitive and user-friendly from the first use.

### MetaModel Definition
In the context of Model-Driven Engineering (MDE), a meta-model serves as a foundational abstraction that defines the structure and semantics of a modeling language. In our DSL for Spring Boot RESTful API and Dockerfile generation, the meta-model acts as a conceptual framework, capturing the essential concepts and relationships inherent to the representation of a software project. SpringGen is defined under the meta-model represented below:

\\

### Grammar Building
The grammar aligns with the dedicated meta-model, enabling the precise representation of key project elements in a textual format. Developers can articulate project structures, including entities, data transfer objects (**DTOs**), **repositories**, and their **relationships**, employing an intuitive syntax. **Configuration** settings, **server** specifications, and **database** details are seamlessly integrated, ensuring comprehensive project definitions. This grammar acts as a bridge between the high-level abstraction provided by the DSL and the underlying meta-model, facilitating the creation of Spring Boot applications and Dockerfiles through a concise and expressive textual syntax. Our grammar is as follows:

```grammar org.xtext.example.springgen.SpringGen with org.eclipse.xtext.common.Terminals

generate springgen "http://www.xtext.org/example/springgen/springgen"

SpringBootProject:
    'SpringBootProject' name=ID
    configuration=ProjectConfiguration?
    elements+=ProjectElement*
    dockerfile=Dockerfile?;

ProjectElement:
    Entity | EntityRelationship | DTO | Service | Repository | Controller;

EntityRelationship:
    'relation' type=DatabaseRelations 'between' source=[Entity] 'and' target=[Entity];

ProjectConfiguration:
    'config' '{'
        server=ServerConfiguration?
        database=DatabaseConfiguration
    '}';

ServerConfiguration:
    'server' '{'
        'port' port=INT
        ('contextPath' contextPath=STRING)?
    '}';

DatabaseConfiguration:
    'database' '{'
        'dbms' type=RDBMS
        'name' name=ID
        'port' port=INT
        'username' username=ID
        'password' password=ID
    '}';

Entity:
    'entity' name=ID ('inherits' extends=[Entity])? '{'
        identifier=Identifier
        properties+=Property*
        repository=Repository?
        services+=Service*
        controller=Controller?
    '}';

Identifier:
    'Id' name=ID type=ValueTypes;

DTO:
    'dto' name=ID '{'
        properties+=Property*
    '}';

Service:
    'service' name=ID ('pertainingTo' entity=[Entity])? '{'
        actions+=ServiceAction*
    '}';

Controller:
    'controller' '{'
        baseUrl=STRING?
        customActions+=CustomAction*
        ('create' 'entity:' createParam=ParamTransfer)?
        ('find' 'entity:' findParam=ParamTransfer)?
        ('delete' 'entity:' deleteParam=ParamTransfer)?
    '}';

ServiceAction:
    'operation' name=ID '{'
        'returns' returnType=ReturnType
        ('raises' exceptionType=Type)?
        ('implementation' implementation=STRING)?
        'params' '(' parameters+=ActionParameter* ')'
    '}';

CustomAction:
    method=HttpMethods 'action' name=ID '{'
        ('mappedAt' url=STRING)?
        parameters+=ActionParameter*
    '}';

ActionParameter:
    name=ID ':' type=Type ('default' defaultValue=STRING)?;

Repository:
    'repository' '{'
        findBy+=FindByMethod*
        deleteBy+=DeleteByMethod*
        customQueryMethod+=CustomQueryMethod*
    '}';

FindByMethod:
    'find' 'by' property=ID ':' propertyType=ValueTypes;

DeleteByMethod:
    'delete' 'by' property=ID ':' propertyType=ValueTypes;

CustomQueryMethod:
    'customQuery' '{' query=STRING '}';

Property:
    name=ID ':' type=Type ('default' defaultValue=STRING)?;

Type:
    ValueTypes | ListType | SetType;

ReturnType:
    ValueTypes | ListType | ID;

ListType:
    'List<' type=Type '>';

SetType:
    'Set<' type=Type '>';

ValueTypes:
    FLOAT='float' | LONG='long' | INTEGER='int' | CHAR='char' | BOOLEAN='boolean' | BYTE='byte' | STRING='String';

HttpMethods:
    GET="GET" | DELETE="DELETE" | POST="POST" | PUT="PUT" | PATCH="PATCH";

RDBMS:
    MYSQL="MySQL" | POSTGRES="Postgres" | MARIADB="MariaDB" | H2="H2" | ORACLE="Oracle";

DatabaseRelations:
    MANY_TO_MANY="ManyToMany" | MANY_TO_ONE="ManyToOne" | ONE_TO_MANY="OneToMany";

ParamTransfer:
    REQUEST_BODY="RequestBody" | REQUEST_PARAM="RequestParam" | PATH_VARIABLE="PathVariable";

Dockerfile:
    'dockerfile' '{'
        baseImage=BaseImage
        instructions+=DockerInstruction*
    '}';

BaseImage:
    'FROM' image=STRING;

DockerInstruction:
    RunInstruction | CopyInstruction | ExposeInstruction | EnvInstruction | WorkdirInstruction | CmdInstruction;

RunInstruction:
    'RUN' command=STRING;

CopyInstruction:
    'COPY' source=STRING ':' target=STRING;

ExposeInstruction:
    'EXPOSE' port=INT;

EnvInstruction:
    'ENV' key=ID value=STRING;

WorkdirInstruction:
    'WORKDIR' path=STRING;

CmdInstruction:
    'CMD' command=STRING;


```
### Generator

The generator for the **SpringGen DSL** is responsible for generating the necessary files and code for a Spring Boot project based on the DSL input. The generator handles various aspects of the project, including entities, repositories, services, controllers, DTOs, and Dockerfiles.

**Key Features of the Generator**

1. **Entity Generation**:
   - Generates Java entity classes with JPA annotations.
   - Includes fields for each property specified in the DSL.

2. **Repository Generation**:
   - Creates Spring Data JPA repositories for each entity.
   - Includes methods for basic CRUD operations and custom queries.

3. **DTO Generation**:
   - Generates DTO classes based on the DSL definitions.
   - Utilizes Lombok's `@Builder` annotation for a convenient builder pattern.
   - Generates getter and setter methods for each DTO property.

4. **Controller and Service Generation**:
   - Creates controllers and services for each entity.
   - Controllers handle HTTP requests, while services encapsulate business logic.
   - Generates methods in controllers for CRUD operations and custom actions specified in the DSL.

5. **Properties File Generation**:
   - Generates properties files to configure the Spring Boot application.
   - Different files are generated based on the specified database type in the DSL configuration.

6. **POM.xml Generation**:
   - Generates the POM.xml file for Maven, including dependencies based on the chosen database type.

7. **Dockerfile Generation**:
   - Generates a Dockerfile for containerizing the Spring Boot application.
   - Includes various Docker instructions such as `RUN`, `COPY`, `EXPOSE`, `ENV`, `WORKDIR`, and `CMD`.

8. **Main Class and Test Folder Generation**:
   - Generates the main class for the Spring Boot application.
   - Generates a placeholder test class within the test folder.

This generator automates the creation of boilerplate code, promoting consistency and reducing effort when setting up a new Spring Boot project based on the **SpringGen DSL** specifications.

### Validation

Validation ensures the integrity and correctness of the generated code and configurations. By implementing validation checks, we can catch errors early in the development process, preventing issues that might arise later. Here are some key aspects of the validation role in our project:

1. **Entity Validation**:
   - Ensure that entity names start with a capital letter.
   - Check that each entity has at least one property.
   - Verify that there are no cycles in the entity hierarchy.

2. **Relationship Validation**:
   - Ensure that each relationship has a valid source and target.
   - Check that the source and target of a relationship are different.

3. **Property Validation**:
   - Ensure that property names within an entity are unique.

4. **Service Action Validation**:
   - Ensure that service action names within a service are unique.

5. **Server Configuration Validation**:
   - Ensure that the server configuration has a valid port.

6. **Database Configuration Validation**:
   - Ensure that the database configuration has a valid port.

7. **Project Configuration Validation**:
   - Ensure that the project configuration includes both server and database configurations.

8. **Controller Validation**:
   - Ensure that controller names start with a capital letter.

9. **Dockerfile Validation**:
   - Ensure that the Dockerfile has a base image.
   - Check that Dockerfile instructions are valid.

By implementing these validation checks, we can ensure the quality and correctness of the generated code and configurations, making the development process more robust and reliable.

## Setup and Installation

### Prerequisites
1. Java 11 or later.
2. Maven or Gradle.
3. Eclipse IDE (EMF) with Xtext plugin installed.

### Installation
1. Clone the CodeCrafter repository:
   ```bash
   git clone [https://github.com/username/SpringGen.git](https://github.com/m-elhamlaoui/CodeCrafter.git)
   ```
2. Import the project into your IDE for development.

---

## Usage

1. Create a new SpringGen DSL file (`.springgen`).
2. Define your project, entities, and configurations using the DSL syntax.
3. save DSL file (`.springgen`).
4. The generated files will be available in the output directory.

---

## Example Input

### DSL File (`MySpringBootProject.springgen`)
```text
SpringBootProject MySpringBootProject {
    config {
        server {
            port 8080
        }
        database {
            dbms MySQL
            name testdb
            port 3306
            username root
            password root
        }
    }

    // Define the Person entity
    entity Person {
        Id id long
        nom: String
        age: int

        // Repository methods
        repository {
            find by id: long
            delete by id: long
        }

        // Controller methods
        controller {
            create entity: RequestParam
            delete entity: PathVariable
        }
    }

    // Define a PersonDTO (data transfer object)
    dto PersonDTO {
        nom: String
        age: int
    }

    // Define a RequestDto for request transfer
    dto RequestDto {
        nom: String
        age: int
        childs: List<int>
        idCardNum: String
    }

    // Define a Product entity with repository and controller methods
    entity Product {
        Id id long
        productName: String
        price: float

        repository {
            find by id: long
            find by productName: String
            delete by id: long
        }

        controller {
            create entity: RequestParam
            delete entity: PathVariable
        }
    }

    // Define a ProductDTO
    dto ProductDTO {
        productName: String
        price: float
    }

    // Define the Dockerfile
    dockerfile {
        FROM "openjdk:11-jre-slim"
        RUN "apt-get update && apt-get install -y curl"
        COPY "target/myapp.jar": "/app/myapp.jar"
        EXPOSE 8080
        ENV JAVA_OPTS "-Xms512m -Xmx1024m"
        WORKDIR "/app"
        CMD "java -jar myapp.jar"
    }
}
```

---

## Output Files

After running the generator, the following files will be generated:
1. **Java Entity Classes**: E.g., `Person.java`, `Product.java`
```
package com.springboot.MySpringBootProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import java.util.*;

@Entity
@Table(name = "Person")
@Builder
public class Person {
    @Id
    private null id;
    private org.xtext.example.springgen.springgen.impl.ValueTypesImpl@2584c7f (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) nom;
    private org.xtext.example.springgen.springgen.impl.ValueTypesImpl@531c131a (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) age;

    public null getId() {
        return id;
    }

    public org.xtext.example.springgen.springgen.impl.ValueTypesImpl@2584c7f (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) getNom() {
        return nom;
    }

    public void setNom(org.xtext.example.springgen.springgen.impl.ValueTypesImpl@2584c7f (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) nom) {
        this.nom = nom;
    }
    public org.xtext.example.springgen.springgen.impl.ValueTypesImpl@531c131a (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) getAge() {
        return age;
    }

    public void setAge(org.xtext.example.springgen.springgen.impl.ValueTypesImpl@531c131a (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) age) {
        this.age = age;
    }
}
```
```
package com.springboot.MySpringBootProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import java.util.*;

@Entity
@Table(name = "Person")
@Builder
public class Person {
    @Id
    private null id;
    private org.xtext.example.springgen.springgen.impl.ValueTypesImpl@2584c7f (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) nom;
    private org.xtext.example.springgen.springgen.impl.ValueTypesImpl@531c131a (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) age;

    public null getId() {
        return id;
    }

    public org.xtext.example.springgen.springgen.impl.ValueTypesImpl@2584c7f (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) getNom() {
        return nom;
    }

    public void setNom(org.xtext.example.springgen.springgen.impl.ValueTypesImpl@2584c7f (FLOAT: null, LONG: null, INTEGER: null, CHAR: null, BOOLEAN: null, BYTE: null, STRING: String) nom) {
        this.nom = nom;
    }
    public org.xtext.example.springgen.springgen.impl.ValueTypesImpl@531c131a (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) getAge() {
        return age;
    }

    public void setAge(org.xtext.example.springgen.springgen.impl.ValueTypesImpl@531c131a (FLOAT: null, LONG: null, INTEGER: int, CHAR: null, BOOLEAN: null, BYTE: null, STRING: null) age) {
        this.age = age;
    }
}
```
2. **Repositories**: E.g., `PersonRepository.java`
```
# Server Configuration
server.port = 8080
server.cpath = /api

# Database Configuration
spring.datasource.url = jdbc:org.xtext.example.springgen.springgen.impl.RDBMSImpl@29159552 (MYSQL: MySQL, POSTGRES: null, MARIADB: null, H2: null, ORACLE: null)://localhost:3306/testdb
spring.datasource.username = root
spring.datasource.password = root

# Hibernate Configuration
spring.jpa.hibernate.ddl-auto = update
spring.jpa.show-sql = true
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.org.hibernate.dialect.MySQL5Dialect
```

 `ProductRepository.java` 
```
package com.springboot.MySpringBootProject.repository;

import lombok.*;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.MySpringBootProject.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, null> {
    List<Product> findById(null id);
    List<Product> findByProductName(String productName);

    void deleteById(null id);

}
```
3. **DTOs**: E.g., `PersonDTO.java`,`ProductDTO.java`
```
package com.springboot.MySpringBootProject.repository;

import lombok.*;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.MySpringBootProject.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, null> {
    List<Product> findById(null id);
    List<Product> findByProductName(String productName);

    void deleteById(null id);

}
```
4. **Controllers**: E.g., `PersonController.java`, `ProductController.java`
```
package com.springboot.MySpringBootProject.repository;

import lombok.*;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.MySpringBootProject.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, null> {
    List<Product> findById(null id);
    List<Product> findByProductName(String productName);

    void deleteById(null id);

}```
5. **Service Layer**: E.g., `PersonService.java`, `ProductService.java`
```
package com.springboot.MySpringBootProject.repository;

import lombok.*;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.MySpringBootProject.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, null> {
    List<Product> findById(null id);
    List<Product> findByProductName(String productName);

    void deleteById(null id);

}```
6. **Application Configuration**: `application.properties`
```

# Server Configuration
server.port = 8080
server.cpath = /api

# Database Configuration
spring.datasource.url = jdbc:org.xtext.example.springgen.springgen.impl.RDBMSImpl@29159552 (MYSQL: MySQL, POSTGRES: null, MARIADB: null, H2: null, ORACLE: null)://localhost:3306/testdb
spring.datasource.username = root
spring.datasource.password = root

# Hibernate Configuration
spring.jpa.hibernate.ddl-auto = update
spring.jpa.show-sql = true
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.org.hibernate.dialect.MySQL5Dialect
```
7. **Dockerfile`**:`Dockerfile`

---

## Contributing

Contributions are welcome! Please follow these steps:
1. Fork the repository.
2. Create a new feature branch:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add new feature"
   ```
4. Push the branch and create a Pull Request.

---

## License

This project is licensed under the MIT License. See the LICENSE file for details.

