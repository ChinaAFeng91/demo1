package com.capf.af.bootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hellow")
public class Hellow {
    @RequestMapping("hi")
    public String show(){

        return "Hello,World";

    }
}
