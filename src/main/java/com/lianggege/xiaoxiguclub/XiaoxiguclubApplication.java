package com.lianggege.xiaoxiguclub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.lianggege.xiaoxiguclub.mapper")
public class XiaoxiguclubApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(XiaoxiguclubApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(XiaoxiguclubApplication.class, args);
    }

}

