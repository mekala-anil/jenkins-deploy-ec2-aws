package com.anil.jenkins_deploy_ec2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getState(){
        return "Application is Up";
    }

    @GetMapping("/hello")
    public String getMessage(){
        return "Hello User";
    }
}
