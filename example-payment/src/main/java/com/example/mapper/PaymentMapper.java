package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * *********************************************************************
 * 支付mapper
 * *********************************************************************
 *
 * @author huangfu
 * @date 2020/10/11 21:30
 */
@Repository
public interface PaymentMapper extends BaseMapper<Payment> {
}
