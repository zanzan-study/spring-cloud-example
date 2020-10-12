package com.example.controller;

import com.example.entity.Payment;
import com.example.service.PaymentService;
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
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("savePayment")
    public void savePayment(@RequestBody Payment payment){
        paymentService.savePayment(payment);
    }

    @PostMapping("findAllPayment")
    public List<Payment> findAllPayment(){
        return paymentService.findAllPayment();
    }
}
