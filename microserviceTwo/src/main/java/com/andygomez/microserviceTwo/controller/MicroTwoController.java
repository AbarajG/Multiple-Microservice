package com.andygomez.microserviceTwo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MicroTwoController {

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
