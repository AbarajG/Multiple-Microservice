package com.andygomez.UserService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiUser")
public class UserController {

    @GetMapping("/name")
    public String getName(){
        return "Rodolfo";
    }

    @GetMapping("/address")
    public String getAddress(){
        return "Avenida central";
    }

    @GetMapping("/status")
    public String getStatus(){
        return "active";
    }

}
