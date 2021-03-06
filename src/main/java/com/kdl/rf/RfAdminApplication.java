package com.kdl.rf;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class, DruidDataSourceAutoConfigure.class})
public class RfAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(RfAdminApplication.class, args);
    }

}
