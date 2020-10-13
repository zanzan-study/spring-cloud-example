package com.example.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

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
public class Payment implements Serializable {
    @ApiModelProperty(value = "流水id")
    private Long id;
    @ApiModelProperty(value = "流水号")
    private String serial;
}
