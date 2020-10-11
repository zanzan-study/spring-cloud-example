package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * *********************************************************************
 * 支付实体类
 * *********************************************************************
 *
 * @author huangfu
 * @date 2020/10/11 21:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long id;
    private String serial;
}
