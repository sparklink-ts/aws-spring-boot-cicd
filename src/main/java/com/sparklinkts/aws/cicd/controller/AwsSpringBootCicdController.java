package com.sparklinkts.aws.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsSpringBootCicdController {

    @GetMapping("/aws-cicd-demo")
    public String getMessage(){
        return "AWS - CICD Demo says .. Hello World !!!";
    }

}
