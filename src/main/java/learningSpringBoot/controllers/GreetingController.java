package learningSpringBoot.controllers;
//REST controller

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello/{name}")
    public String greeting(String name) {
        return "Hello, " + name + "!";
    }
}
