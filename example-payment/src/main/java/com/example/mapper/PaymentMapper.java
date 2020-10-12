package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * *********************************************************************
 * 支付mapper
 * *********************************************************************
 *
 * @author huangfu
 * @date 2020/10/11 21:30
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
}
