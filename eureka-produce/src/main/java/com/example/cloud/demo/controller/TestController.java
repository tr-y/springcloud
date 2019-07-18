package com.example.cloud.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "get")
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "test")
    public String getTest(@RequestParam(value = "name") String name){
        return "produce"+name+" success ";
    }

    @ResponseBody
    @GetMapping(value = "ZuulTest")
    public Map  getZuulTest(@RequestParam(value = "name") String name){
        Map  resultMap = new HashMap();
        resultMap.put("data",name);
        resultMap.put("message","this is first produce");
        resultMap.put("isok","success");
        return resultMap;
    }

    @ResponseBody
    @GetMapping(value = "ZuulRibbonTest")
    public Map getZuulRibbonTest(){
        Map resultMap = new HashMap();
        resultMap.put("isok","true");
        logger.info("this is  first service ");
        try {
            Thread.sleep(900);//默认zuul的超时时间是1000ms
        } catch (InterruptedException e) {
            resultMap.put("isok","fail");
        }
        return  resultMap;
    }
}
