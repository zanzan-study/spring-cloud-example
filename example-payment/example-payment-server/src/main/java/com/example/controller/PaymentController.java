package com.example.controller;

import com.example.entity.Payment;
import com.example.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("savePayment")
    public void savePayment(@RequestBody Payment payment){
        log.info("-----------【保存支付数据】-----------");
        paymentService.savePayment(payment);
    }

    @PostMapping("findAllPayment")
    public List<Payment> findAllPayment(){
        log.info("-----------【查询支付数据】------------");
        return paymentService.findAllPayment();
    }

    @PostMapping("findPaymentById")
    public Payment findPaymentById(Long id){
        log.info("-----------【根据id查询支付数据{}】-----------",id);
        return paymentService.findPaymentById(id);
    }
}
