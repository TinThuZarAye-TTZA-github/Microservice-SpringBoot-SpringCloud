Department
------------  
Dependency: Spring Web, Spring Data JPA, H2 Database, MySQL Driver, Lombok, Spring Cloud stater Bootstrap, Eureka Discovery Client    
port : 8080  

User
-----
Dependency: Spring Web, Spring Data JPA, H2 Database, MySQL Driver, Lombok, Spring Cloud stater Bootstrap,  Eureka Discovery Client    
port : 8081  

API Gateway
------------ 
Dependency : Eureka Discovery Client, gateway, Spring Boot Actuator, Hystrix, Spring Cloud stater Bootstrap  
prot : 8989  

Eureka Registry
---------------- 
Dependency : Eureka Server  
port : 8761  

Cloud Config
-------------
Dependency : Eureka Discovery Client, Config Server  
port : 9296  

URL
-----
GET - http://localhost:8989/department/{depatmentId}  
POST - http://localhost:8989/department/add  
{  
    "departmentName" : "department1",  
    "departmentAddress" : "address",  
    "departmentCode": "department1-1"  
} 

GET - http://localhost:8989/user/{userId}  
POST - http://localhost:8989/department/add  
{  
    "firstName" : "firstName",  
    "lastName" : "lastName",  
    "email" : "abc@gmail.com",  
    "departmentId" : 1  

}

Microservice Architecture
--------------------------
<img width="849" alt="Screen Shot 2022-10-26 at 12 54 42 AM" src="https://user-images.githubusercontent.com/97212223/197968636-647c57bd-6375-43f2-95fb-a50a351fee0b.png">


