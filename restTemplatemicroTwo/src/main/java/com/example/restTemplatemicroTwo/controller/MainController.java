package com.example.restTemplatemicroTwo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/templateTwo")
public class MainController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/message")
    public String getMessage(){
        String stringObj = restTemplate.getForObject("http://localhost:9094/templateOne/template", String.class);
        return stringObj  + " Second microservice rest template message";
    }

}
