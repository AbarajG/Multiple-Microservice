package com.andygomez.microserviceOne.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiOne")
public class MainController {

    @GetMapping("/message")
    public String getMainMessage(){
        return "Main message";
    }

    @GetMapping("/name")
    public String getName(){
        return "Andy";
    }

    @GetMapping("/address")
    public String getAddress(){
        return "Priv Random";
    }

    @GetMapping("/status")
    public String getStatus(){
        return "Active";
    }

}
