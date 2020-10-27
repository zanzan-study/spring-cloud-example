package com.example.payment.api.impl;

import com.common.core.result.CommonResult;
import com.example.payment.api.PaymentServiceApi;
import org.springframework.stereotype.Component;

/**
 * @author huangfu
 */
@Component
public class PaymentServiceApiImpl implements PaymentServiceApi {
    @Override
    public CommonResult findAllPayment() {
        return CommonResult.timeout();
    }
}
