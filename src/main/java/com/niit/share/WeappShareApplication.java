package com.niit.share;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.niit.share.mapper")
public class WeappShareApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeappShareApplication.class, args);
    }

}
