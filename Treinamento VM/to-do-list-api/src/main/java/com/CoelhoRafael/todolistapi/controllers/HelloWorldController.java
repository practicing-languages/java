package com.CoelhoRafael.todolistapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SuppressWarnings("unused")
public class HelloWorldController {

    @GetMapping("/hello")
public String hello(){
        return "world";
    }

    @GetMapping("/hello-from/{name}")
    public String helloFromPath(
            @PathVariable String name

    ){
        return "Olá " + name;
    }

}
