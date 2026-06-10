package learningSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import static learningSpringBoot.services.Palindrome.isPalindrome;

@RestController
public class GreetingController {

    /**
     *
     * @param name input variable.
     * @return a String with the {name} variable.
     */

    @GetMapping("/hello/{name}")
    public String greeting(@PathVariable String name) {

        return "Hello, " + name + "!";
    }

    /**
     *
     * @param word input variable.
     * @return if {word} is a palindrome or not.
     */

    @GetMapping("/palindrome/{word}")
    public String palindrome (@PathVariable String word) {

        return isPalindrome(word);
    }

}

/* @PathVariable annotation to extract dynamic values directly from an HTTP request's URL path and map them to method parameters */