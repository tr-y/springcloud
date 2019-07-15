package com.example.eurka.demo.controller;

import com.example.eurka.demo.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping(value = "get")
@Controller
public class ConsumerController {


    @Autowired
    HelloRemote helloRemote;


    @ResponseBody
    @GetMapping(value = "test")
    public String test(){
       String result =  helloRemote.getValue("测试");
       return result;
    }


}
