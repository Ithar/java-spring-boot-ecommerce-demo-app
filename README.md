# java-spring-boot-security-actuator
Demo project for Spring Boot security &amp; actuator

Working with docker-compose to create a webapp with Spring security and mysql tables.

#### Features
- Spring Security 
  - Roles: (admin and user) 
- Actuator links
- Thymeleaf Login page   
- Docker compose 
    - Web App Service    
    - DB Service
  
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

## Application Run (Docker)
```
cd docker
docker-compose build 
docker-compose up  

http://localhost:8082/security-actuator-demo-0.0.1-SNAPSHOT/ (WIP)
```

## Application Run (IntelliJ) 
```
docker-compose up db 
IntelliJ run com.malik.ithar.security.demo.SecurityDemoApp
http://localhost:8080/info
http://localhost:8080/actuator
```

## Future Enhancements 
- Style html 
- Add header navigation

## Note 
- https://www.baeldung.com/spring-security-registration-password-encoding-bcryp
- https://stackabuse.com/password-encoding-with-spring-security/
- https://reflectoring.io/spring-security-password-handling/
- https://www.devglan.com/spring-security/spring-boot-security-password-encoding-bcrypt-encoder
- http://websystique.com/spring-security/spring-security-4-password-encoder-bcrypt-example-with-hibernate/
