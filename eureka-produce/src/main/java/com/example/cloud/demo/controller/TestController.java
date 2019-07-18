package com.example.cloud.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "get")
public class TestController {


    @RequestMapping(value = "test")
    public String getTest(@RequestParam(value = "name") String name){
        return "produce"+name+" success ";
    }

    @ResponseBody
    @GetMapping(value = "getZuulTest")
    public Map  getZuulTest(@RequestParam(value = "name") String name){
        Map  resultMap = new HashMap();
        resultMap.put("data",name);
        resultMap.put("isok","success");
        return resultMap;
    }
}
