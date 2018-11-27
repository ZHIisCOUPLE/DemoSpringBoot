package com.demospringbboot.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloSpringBoot {


    @GetMapping("/hi")
    public String sehi(){
        return "hello spring boot!!!";
    }
}
