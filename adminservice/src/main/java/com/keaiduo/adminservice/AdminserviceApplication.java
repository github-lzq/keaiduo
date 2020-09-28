package com.keaiduo.adminservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/keaiduo/adminservice/mapper")
public class AdminserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminserviceApplication.class, args);
    }
}
