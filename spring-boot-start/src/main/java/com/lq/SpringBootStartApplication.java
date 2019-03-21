package com.lq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.Socket;

@SpringBootApplication
@MapperScan("com.lq.mapper")
public class SpringBootStartApplication {

    public static void main(String[] args) {

//        Socket socket = new Socket();
        SpringApplication.run(SpringBootStartApplication.class, args);
    }

}
