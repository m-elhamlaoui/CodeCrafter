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

HTTP methods ('GET', 'POST', 'PUT', 'DELETE', 'PATCH') and database types (e.g., 'MYSQL', 'POSTGRES') are supported.

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

### Example DSL Input

