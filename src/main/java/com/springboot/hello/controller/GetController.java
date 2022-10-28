package com.springboot.hello.controller;

import com.springboot.hello.domain.dto.MemberDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
@Slf4j
public class GetController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        log.info("hello로 요청이 들어왔습니다.");
        return "Hello World";
    }

    @GetMapping(value = "/name")
    public String getName(){
        log.info("getNames으로 요청이 들어왔습니다.");
        return "Sujin";
    }

    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable){
        log.info("getVariable1으로 요청이 들어왔습니다.");
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

    @GetMapping(value = "/request3")
    public String getRequestParam3(MemberDto memberDto){
        return memberDto.toString();
    }
}
