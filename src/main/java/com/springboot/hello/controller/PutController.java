package com.springboot.hello.controller;

import com.springboot.hello.domain.dto.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {
//    @RequestMapping(value = "/domain", method = RequestMethod.POST)
//    public String postExample(){
//        return "hello Post APIP";
//    }
//
//    @PostMapping("/member")
//    public String postMember(@RequestBody Map<String, Object> postData){
//        StringBuilder sb = new StringBuilder();
//        postData.entrySet().forEach(map->sb.append(map.getKey()+":"+map.getValue()+"\n"));
//        return sb.toString();
//    }

    @PutMapping("/member3")
    public ResponseEntity<MemberDto> putMember(@RequestBody MemberDto memberDto){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(memberDto);
    }
}
