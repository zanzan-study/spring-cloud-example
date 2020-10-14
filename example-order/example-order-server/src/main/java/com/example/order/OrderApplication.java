package com.example.order;

import com.irole.MySelfRoleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author huangfu
 * @see EnableDiscoveryClient
 * @see RibbonClient  对支付微服务使用自定义的负载方案
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "EXAMPLE-PAYMENT", configuration = MySelfRoleConfig.class)
@EnableFeignClients(basePackages = "com.example.payment.api")
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}
