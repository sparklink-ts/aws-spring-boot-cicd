package com.sparklinkts.aws.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsSpringBootCicdController {

    @GetMapping("/aws-cicd")
    public String getMessage(){
        return "AWS - CICD with Elastic Beanstalk (Staging Server : Stage Deployment ) - Code Pipeline - Code Build - SNS (POD Lead Approval) and Elastic Beanstalk (Production Server : Prod Deployment ) is Working Fine !!! Great Work !!!";
    }

}
