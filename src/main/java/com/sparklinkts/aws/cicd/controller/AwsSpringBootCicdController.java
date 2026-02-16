package com.sparklinkts.aws.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsSpringBootCicdController {

    @GetMapping("/aws-cicd")
    public String getMessage(){
        return "AWS - CICD with Elastic Beanstalk - Code Pipeline - Code Build is done !!! Great Work !!!";
    }

}
