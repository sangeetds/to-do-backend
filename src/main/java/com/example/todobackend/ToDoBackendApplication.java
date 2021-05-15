package com.example.todobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToDoBackendApplication.class, args);
    }

}

/*
    Model --- View --- Controller
    Data  ---  UI  --- API

Req:    View ---> Controller ---> Model
Res:         <---            <---


    HTTP Call -> GET, POST, PUT, PATCH, DELETE
    www.facebook.com/ -> API

    Controller(APIs) -> GET -> Data
    Controller -->    Service         --> Repository(DB-accesible-layer)
    (Req/Res)         (Bus. Logic)       (DB-accesible-layer)
 */
