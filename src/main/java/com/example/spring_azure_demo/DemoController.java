package com.example.spring_azure_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/message")
    public String getMessage(){
        return "Congrats!! you app is deployed to azure..";
    }
}
