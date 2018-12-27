package com.lianggege.xiaoxiguclub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lianggege.xiaoxiguclub.mapper")
public class XiaoxiguclubApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoxiguclubApplication.class, args);
    }

}

