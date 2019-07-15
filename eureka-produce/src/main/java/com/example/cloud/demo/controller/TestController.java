package com.example.cloud.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController(value = "get")
public class TestController {


    @RequestMapping(value = "test")
    public String getTest(@RequestParam(value = "name") String name){
        Map  resultMap = new HashMap();
        resultMap.put("data","success");
        return "produce";
    }
}
