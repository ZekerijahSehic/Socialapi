package com.zekerijah.socialapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {
    @RequestMapping("/")
    public String welcome(){
        return "Wellcome to Social Api";
    }
}
