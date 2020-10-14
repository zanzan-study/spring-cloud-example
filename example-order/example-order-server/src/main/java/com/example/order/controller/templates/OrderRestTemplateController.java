package com.example.order.controller.templates;

import com.common.core.result.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 传统方式的负载均衡方案
 *
 * @author huangfu
 */
@RestController
public class OrderRestTemplateController {
    /**
     * 注册中心的额服务名称
     */
    private static final String SERVER_PRE = "http://EXAMPLE-PAYMENT/";
    private final RestTemplate restTemplate;

    public OrderRestTemplateController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * 直接使用服务名称来基于负载均衡远程调用服务
     * @return 返回服务的结果
     */
    @GetMapping("order/test")
    public CommonResult paymentList() {
        return restTemplate.postForEntity(SERVER_PRE + "payment/findAllPayment", null, CommonResult.class).getBody();
    }
}
