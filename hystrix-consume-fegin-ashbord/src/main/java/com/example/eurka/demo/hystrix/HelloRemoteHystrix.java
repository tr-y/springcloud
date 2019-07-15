package com.example.eurka.demo.hystrix;

import com.example.eurka.demo.remote.HelloRemote;
import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String getValue(String name) {
        return "this message is send faild";
    }



}
