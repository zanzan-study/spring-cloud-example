package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * *********************************************************************
 * 支付服务启动类
 * *********************************************************************
 *
 * @author huangfu
 * @date 2020/10/11 19:35
 */
@SpringBootApplication
@MapperScan("com.example.mapper")
public class PaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class,args);
    }
}
