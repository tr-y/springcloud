package com.example.cloud.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {

        try {
            InetAddress ip = InetAddress.getByName("www.baidu.com");
            System.out.println("测试");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

}
