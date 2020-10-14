package com.example.order.controller.feigns;

import com.common.core.result.CommonResult;
import com.example.payment.api.PaymentServiceApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignOrderController {
    private final PaymentServiceApi paymentServiceApi;

    public FeignOrderController(PaymentServiceApi paymentServiceApi) {
        this.paymentServiceApi = paymentServiceApi;
    }

    @GetMapping("feign/test")
    public CommonResult getAllPayment(){
        return paymentServiceApi.findAllPayment();
    }
}
