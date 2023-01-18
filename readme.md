# JPA - [Specification pattern](https://wesome.org/spring-data-jpa-specifications)

Spring Data Jpa provides multiple ways to create underlying database queries such as using method names, @Query annotation, named queries etc.
Spring Data JPA Criteria query helps to create where clause of the query for domain or entity class. Spring Data Jpa provides Criteria Api to build Query for underlying database programmatically.

Spring Data Jpa adopt the concept from "Domain Driven Design" from Eric Evans' book, using the same semantics, Spring Data creates JpaSpecificationExecutor interface.
JpaSpecificationExecutor interface provides APIs and methods to define Specifications and create Spring Data Jpa Criteria. Spring Data JPA Criteria. are build on top of the Criteria API to simplify the where clause.
Specifications interface help to build a set of query methods for Domain or entity class without actually declaring query.