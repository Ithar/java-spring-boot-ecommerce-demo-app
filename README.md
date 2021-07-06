# java-spring-boot-security-actuator
Demo project for Spring Boot security &amp; actuator

Working with docker-compose to create a webapp with Spring security and mysql tables.

#### Features
- Spring Security Long page
- Actuator dashboard 

## Application Stack

Stack  | version |
--- | --- |  
*Java* | 1.8
*SpringBoot* |  2.2.4.RELEASE
*Frontend* | Thymeleaf 
*DB* | mysql (via docker)
*Server* | IntelliJ (embedded)
*Build Tool* | Maven
*CI* | n/a
*Code Coverage* | n/a
*Build env* | docker-compose

## Application Users
    Users 1:
    Username: Admin/Admin#123
    Role: ROLE_USER, ROLE_ADMIN

    Users 2:
    Username: Jane/Password#123
    Role: ROLE_USER

## Application Run
```
cd docker
docker-compose build  
```

## Application URL
http://localhost:8080/home.html


## Note 
- https://www.baeldung.com/spring-security-registration-password-encoding-bcryp
- https://stackabuse.com/password-encoding-with-spring-security/
- https://reflectoring.io/spring-security-password-handling/
- https://www.devglan.com/spring-security/spring-boot-security-password-encoding-bcrypt-encoder
- http://websystique.com/spring-security/spring-security-4-password-encoder-bcrypt-example-with-hibernate/
