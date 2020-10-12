package com.example.service;

import com.example.entity.Payment;

import java.util.List;

/**
 * *********************************************************************
 * 支付服务
 * *********************************************************************
 *
 * @author huangfu
 * @date 2020/10/11 23:28
 */
public interface PaymentService {
    /**
     * 查询所有的支付信息
     *
     * @return 返回所有的支付信息
     */
    List<Payment> findAllPayment();

    /**
     * 根据id查询支付信息
     *
     * @param id id
     * @return 支付实体
     */
    Payment findPaymentById(Long id);

    /**
     * 保存支付信息
     *
     * @param payment 支付信息
     */
    void savePayment(Payment payment);
}
