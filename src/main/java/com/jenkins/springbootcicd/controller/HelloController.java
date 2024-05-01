package com.jenkins.springbootcicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

   @GetMapping("/welcome")
    public String getMessage(){
       return "Ceci est une API de Test du CI/CD via l'outils Jenkins";
   }

}
