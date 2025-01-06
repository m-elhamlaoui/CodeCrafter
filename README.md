# SpringGen: A DSL for Automated Spring Boot and Dockerfile Generation

## Introduction

**SpringGen** is a Domain-Specific Language (DSL) designed to streamline the development of Spring Boot applications and their corresponding Dockerfiles. By leveraging **Model-Driven Engineering** (MDE) principles, **SpringGen** provides a high-level, expressive syntax that allows developers to define the structure and behavior of their applications in a concise and intuitive manner. This DSL aims to reduce redundancy and simplify the generation of basic code, making it easier to create **CRUD (Create, Read, Update, Delete) RESTful APIs** and containerize them using Docker.

**SpringGen** is built on top of powerful tools and frameworks, including Xtext for defining the DSL syntax and semantics, Xtend for code generation, and **EMF** for model handling. Together, these technologies enable seamless **model-to-model and model-to-text transformations**, ensuring consistency and maintainability in the development process.

Whether you are a full-stack developer or a software engineer, **SpringGen** offers a unified approach to generating Spring Boot applications, allowing you to focus on the unique aspects of your project while automating the repetitive tasks. This README will guide you through the setup, usage, and features of **SpringGen**, helping you get started with this powerful tool.

## DSL Input

**SpringGen DSL** allows the definition of Spring Boot RESTful APIs and Dockerfiles through a concise and expressive syntax. The DSL encompasses various aspects of API development, including project configuration, entity modeling, Data Transfer Objects (DTOs), controllers, repositories, and custom actions.

### Project Definition

Define a Spring Boot project using the 'SpringBootProject' keyword, specifying the project name ('name') and optional configuration settings.

### Entity Modeling

Entities are defined using the 'entity' keyword, specifying the entity name ('name'), identifier details, properties, repository, and controller.

### Data Transfer Objects (DTOs)

DTOs are defined using the 'dto' keyword, specifying the DTO name ('name') and its properties.

### Controllers

Controllers are defined using the 'controller' keyword, allowing the specification of base URLs, custom actions, and CRUD operations.

### Custom Actions

Custom actions are defined using the 'service' keyword, providing details such as HTTP method, path, return type, implementation, and parameters.

### Repositories

Repositories are defined using the 'repository' keyword, encompassing custom query methods, 'find by' methods, and 'delete by' methods.

### Configuration

Configuration settings, including server and database details, are defined using the 'config' keyword.

### Data Types

Various data types, including primitive types and enumerations, are supported.

### Relationships

Entity relationships, such as Many-to-Many ('MANY_TO_MANY'), Many-to-One ('MANY_TO_ONE'), and One-to-Many ('ONE_TO_MANY'), can be specified.

### HTTP Methods and Database Types

HTTP methods ('GET', 'POST', 'PUT', 'DELETE', 'PATCH') and database types ('MariaDB', 'MYSQL', 'POSTGRES', 'H2', 'Oracle') are supported.

### Parameter Transfer Types

Different parameter transfer types, such as 'RequestBody', 'RequestParam', and 'PathVariable', are available for custom actions.

### Dockerfile

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
## Generator

The generator for the **SpringGen DSL** is responsible for generating the necessary files and code for a Spring Boot project based on the DSL input. The generator handles various aspects of the project, including entities, repositories, services, controllers, DTOs, and Dockerfiles.

### Key Features of the Generator

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

### Example Generator Code

Below is an example of the generator code that handles the generation of various components based on the DSL input:

