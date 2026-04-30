package com.example.spring_azure_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/message")
    public String getMessage(){
        return "Congrats!! Your Application is successfully deployed to Azure..";
    }

    @GetMapping("/message2")
    public String getMessage2(){
        return "Congrats2!! Your Application is successfully deployed to Azure..";
    }

    @GetMapping("/message3")
    public String getMessage3(){
        return "Congrats3!! Your Application is successfully deployed to Azure..";
    }
}
