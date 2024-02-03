package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class controllerA {

    @RequestMapping(value = "/v1/check" , method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public int normalMethod(){
        return 1;
    }
}
