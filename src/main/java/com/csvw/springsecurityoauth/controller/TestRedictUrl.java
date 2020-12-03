package com.csvw.springsecurityoauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class TestRedictUrl {

    @ResponseBody
    @GetMapping(value = "/one")
    public String test(){
        return "Hey, this is a test";
    }
}
