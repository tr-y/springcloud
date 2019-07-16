package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@RefreshScope
@RestController
@RequestMapping(value = "configureTest")
public class HelloController {

    @Value("${configtest}")
    private String configerTest;


    @ResponseBody
    @GetMapping(value = "get")
    public Map getConfigTest(){
        Map resultMap = new HashMap();
        resultMap.put("data","error");
        if(configerTest!=null){
            resultMap.put("data",configerTest);
        }
        return resultMap;
    }



}
