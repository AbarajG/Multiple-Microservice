package com.andygomez.OpenFeing.controller;

import com.andygomez.OpenFeing.FeignUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feignService")
public class FeignController {

    @Autowired
    private FeignUtil feignUtil;

    @GetMapping("/name")
    public String getName(){return feignUtil.getName();}

    @GetMapping("/address")
    public String getAddress(){
        return feignUtil.getAddress();
    }

    @GetMapping("/status")
    public String getStatus(){
        return feignUtil.getStatus();
    }

}
