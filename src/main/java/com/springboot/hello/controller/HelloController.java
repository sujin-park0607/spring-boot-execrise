package com.springboot.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello World";
    }

    @GetMapping(value = "/name")
    public String getName(){
        return "Sujin";
    }

    @GetMapping(value = "/variable1/{variable}")
    public String getName(@PathVariable String variable){
        return variable;
    }
}
