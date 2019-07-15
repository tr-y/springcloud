package com.exampl.customer1.demo.hystrix;

import com.exampl.customer1.demo.remote.HelloRemote;
import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String getValue(String name) {
        return "this message is send faild";
    }



}
