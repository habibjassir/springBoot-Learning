package learningSpringBoot.controllers;
//REST controller

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import static learningSpringBoot.controllers.Palindrome.isPalindrome;

@RestController
public class GreetingController {

    @GetMapping("/hello/{name}")
    public String greeting(@PathVariable String name) {

        return "Hello, " + name + "!";
    }

    @GetMapping("/palindrome/{word}")
    public String palindrome (@PathVariable String word) {

        return isPalindrome(word);
    }

}

/* @PathVariable annotation to extract dynamic values directly from an HTTP request's URL path and map them to method parameters */