package com.common.web;

import com.common.core.exceptions.ExceptionEnum;
import com.common.core.exceptions.IException;
import com.common.core.result.CommonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * *********************************************************************
 * 全局异常统一封装入口
 * *********************************************************************
 *
 * @author huangfu
 * @date 2020/10/11 23:18
 */
@RestControllerAdvice
public class ExampleExceptionHandle {

    /**
     * 全局异常
     *
     * @param e 异常信息
     * @return 错误结果集
     */
    @ExceptionHandler(value = {Exception.class})
    public CommonResult requestException(Exception e) {
        e.printStackTrace();
        if (e instanceof IException) {
            return resultBuild(e);
        }
        return CommonResult.error();
    }


    /**
     * 结果集构建
     *
     * @param exception 异常信息
     * @return 全局结果集
     */
    public CommonResult resultBuild(Exception exception) {
        IException iException = (IException) exception;
        ExceptionEnum exceptionEnum = iException.getExceptionEnum();
        return new CommonResult(exceptionEnum.getCode(), exceptionEnum.getMessage());
    }
}
