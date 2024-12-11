# Getting Started
### Notes
This project created from spring initializr (Maven) and added below dependencies, refer to main pom.xml:
* Spring Web
* Spring Security
* Spring Data JPA
* H2 Database


Development Steps:
1. Configure H2 Database by Adding configuration to the \src\main\resources\application.properties

2. Create the Transaction Entity Class 
(as DB map in Java object) Create a class  com.example.api.entity.Transaction.java

3. Create the Repository to find the records by customerID, AccountNumber or Description
Create an Interface com.example.api.repository.TransactionRepository.java

4. Create the Service Layer for CRUD(create, read, update, delete) transaction
Create a class com.example.api.service.TransactionService.java

5. Create the Controller to define API path and logic
Create a class com.example.api.controller.TransactionController

6. Add Authentication
Spring Security is already included (via the spring-boot-starter-security dependency). Add configuration to com.example.api.config.SecurityConfig.java

7. Add Swagger Documentation
Swagger is included with the springfox-boot-starter dependency. Adding configuration to the \src\main\resources\application.properties

8. Class Diagram:
+------------------+      +-----------------+       +------------------+
|   Transaction    |      | TransactionRepo |       | TransactionSvc   |
+------------------+      +-----------------+       +------------------+
| - accountNumber  |      | findById()      |       | getAllTxns()     |
| - trxAmount      |      | findByCustId()  |       | searchTxns()     |
| - description    |      | findByDesc()    |       | updateTxn()      |
| - trxDate        |      +-----------------+       +------------------+
| - customerId     |
+------------------+

9. Activity Diagram:
Start -> Authenticate -> Validate Input -> Process Request -> Return Response -> End

10. Design Pattern

a. Service Layer Pattern: It separates business logic from the controller, making the application easier to test and maintain, also promotes reusability of business logic across multiple controllers.

Spring Design Pattern itself:
b. Singleton: creates a singleton instance of the repository to ensure efficient database access and resource usage.
c. Dependency Injection: Helps eliminate the dependencies within a class, making it independent of the specific objects it relies on. Dependency injection promotes loose coupling and easier testing.
 


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.6/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.6/maven-plugin/build-image.html)
* [Spring Security](https://docs.spring.io/spring-boot/3.3.6/reference/web/spring-security.html)
* [Spring Data JPA](https://docs.spring.io/spring-boot/3.3.6/reference/data/sql.html#data.sql.jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/3.3.6/reference/web/servlet.html)
* [Validation](https://docs.spring.io/spring-boot/3.3.6/reference/io/validation.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

