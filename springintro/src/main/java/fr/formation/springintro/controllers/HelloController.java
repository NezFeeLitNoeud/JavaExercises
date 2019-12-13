package fr.formation.springintro.controllers;


import fr.formation.springintro.pojos.HelloWorld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloController {

    @GetMapping
    public HelloWorld helloWorld(){
        return new HelloWorld("Hello World", LocalDateTime.now());
    }
}
