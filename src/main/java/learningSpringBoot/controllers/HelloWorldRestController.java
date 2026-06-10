package learningSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping ({"/hello", "/hola", "/saludo"})
    public String helloWorld() {
        System.out.println("Request succesfully Listened from port 8080 :) !");
        return "Hello World";
    }
}
