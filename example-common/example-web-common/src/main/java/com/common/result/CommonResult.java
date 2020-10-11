package com.common.result;

import com.common.exceptions.UnknownEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * *********************************************************************
 * 全局结果集封装
 * *********************************************************************
 *
 * @author huangfu
 * @date 2020/10/11 21:35
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult {
    private static final String SUCCESS_CODE = "200";
    private static final String SUCCESS_MESSAGE = "成功";
    private String code;
    private String message;
    private Object result;

    public CommonResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 成功
     *
     * @return 成功
     */
    public static CommonResult ok() {
        return new CommonResult(UnknownEnum.UNKNOWN_SUCCESS.getCode(), UnknownEnum.UNKNOWN_SUCCESS.getMessage());
    }

    public static CommonResult ok(Object t) {
        return new CommonResult(UnknownEnum.UNKNOWN_SUCCESS.getCode(), UnknownEnum.UNKNOWN_SUCCESS.getMessage(), t);
    }

    public static CommonResult error() {
        return new CommonResult(UnknownEnum.UNKNOWN_EXCEPTION.getCode(), UnknownEnum.UNKNOWN_EXCEPTION.getMessage());
    }

    public static CommonResult error(UnknownEnum unknownEnum) {
        return new CommonResult(unknownEnum.getCode(), unknownEnum.getMessage());
    }
}
