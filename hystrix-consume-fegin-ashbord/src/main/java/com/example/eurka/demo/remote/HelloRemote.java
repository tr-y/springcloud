package com.example.eurka.demo.remote;


import com.example.eurka.demo.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(value = "/test")
    String getValue(@RequestParam(value = "name")String name);
}
