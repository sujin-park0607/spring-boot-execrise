package com.springboot.hello.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

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

    @GetMapping(value = "/request1")
    public String getVariable(@RequestParam String name, @RequestParam String email, @RequestParam String organization ){
        return name+" " + email+" " + organization+" ";
    }

    @GetMapping(value = "/request2")
    public String getVariable2(@RequestParam Map<String, String> param){
        param.entrySet().forEach((map -> {
            System.out.printf("key: %s value: %s\n", map.getKey(), map.getValue());
        }));
        return "request2가 호출 완료 되었습니다";
    }
}
