# Star Wars API and Star Wars Client Application

Planet creation, deletion, listing, listing per name and listing per id API and Client Application.

## Getting Started

Open a terminal and git clone the two projects into a directory. Open the IDE (Eclipse, IntelliJ or STS) and open the projects as Maven projects. Run both projects as Java Application. Open Postman and type:

1. POST http://localhost:8001/client/planets/ --> adicionar planeta (com RequestBody como abaixo)

{
	"nome": "Saturno",
	"clima": "Temperado",
	"terreno": "Arenoso",
	"qtdAparicoes": 9
}

2. GET http://localhost:8001/client/planets/ --> listar todos os planetas 

3. GET http://localhost:8001/client/planets/nome/{nome} --> onde {nome} é o nome do planeta que se deseja buscar

4. GET http://localhost:8001/client/planets/id/{id} --> onde {id} é o id do planeta que se deseja buscar

5. DELETE http://localhost:8001/client/planets/{id} --> onde {id} é o id do planeta que se deseja deletar

### Prerequisites

Java 8, Spring Tool Suite, Spring Boot, Spring Data, Spring Web, Swagger, MySQL, JUnit, Mockito, Postman

## Built With

* [Spring Tool Suite](https://spring.io/tools3/sts/all) - The IDE used
* [Maven](https://maven.apache.org/) - Dependency Management
* [Swagger 2](https://swagger.io) - Used to create API documentation
* [MySQL](https://dev.mysql.com) - The database used
* [Spring Initializr](https://start.spring.io) - Spring Initializr
* [JUnit](https://junit.org/junit5/) - JUnit 5
* [Mockito](https://site.mockito.org) - Mockito Framework
* [Postman](https://www.getpostman.com) - Postman

## Versioning

I use [Git](https://git-scm.com) for versioning.

## Authors

* **Erica Okamura** - [Erica Okamura](https://github.com/ericaokamura/)

