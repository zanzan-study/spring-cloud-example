package com.example.controller;

import com.common.annotations.ResultAutoWarp;
import com.example.entity.Payment;
import com.example.service.PaymentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * *********************************************************************
 * 支付服务接口
 * *********************************************************************
 *
 * @author huangfu
 * @date 2020/10/11 11:52
 */
@RestController
@RequestMapping("payment")
@Api(value = "支付服务", tags = "支付服务")
@ResultAutoWarp
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private Integer port;

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("savePayment")
    @ApiOperation(value = "保存一个支付流水号", notes = "保存一个支付流水号")
    public void savePayment(@RequestBody Payment payment){
        log.info("-----------【保存支付数据】-----------");
        paymentService.savePayment(payment);
    }

    @PostMapping("findAllPayment")
    @ApiOperation(value = "查找所有支付流水", notes = "查找所有支付流水")
    public List<Payment> findAllPayment(){
        log.info("端口号{}",port);
        log.info("-----------【查询支付数据】------------");
        return paymentService.findAllPayment();
    }

    @PostMapping("findPaymentById")
    @ApiOperation(value = "基于ID查找支付流水", notes = "基于ID查找支付流水")
    public Payment findPaymentById(Long id){
        log.info("-----------【根据id查询支付数据{}】-----------",id);
        return paymentService.findPaymentById(id);
    }
}
