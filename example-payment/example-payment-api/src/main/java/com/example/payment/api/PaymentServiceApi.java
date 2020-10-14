package com.example.payment.api;

import com.common.core.result.CommonResult;
import com.example.payment.api.impl.PaymentServiceApiImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 支付服务接口
 *
 * @author huangfu
 */
@FeignClient(value = "EXAMPLE-PAYMENT", configuration = PaymentServiceApiImpl.class)

public interface PaymentServiceApi {
    /**
     * 数据接口
     *
     * @return 查询所有接口
     */
    @PostMapping(value = "payment/findAllPayment")
    CommonResult findAllPayment();
}
