package com.example.service.impl;

import com.example.entity.Payment;
import com.example.mapper.PaymentMapper;
import com.example.service.PaymentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * *********************************************************************
 * 支付服务实现类
 * *********************************************************************
 *
 * @author huangfu
 * @date 2020/10/12 11:26
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PaymentServiceImpl implements PaymentService {
    private final PaymentMapper paymentMapper;

    public PaymentServiceImpl(PaymentMapper paymentMapper) {
        this.paymentMapper = paymentMapper;
    }

    @Override
    public List<Payment> findAllPayment() {
        return paymentMapper.selectList(null);
    }

    @Override
    public Payment findPaymentById(Long id) {
        return paymentMapper.selectById(id);
    }

    @Override
    public void savePayment(Payment payment) {
        paymentMapper.insert(payment);
    }
}
