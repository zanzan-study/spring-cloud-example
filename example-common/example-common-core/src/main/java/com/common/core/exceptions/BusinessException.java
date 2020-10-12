package com.common.core.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * *********************************************************************
 * 业务异常
 * *********************************************************************
 *
 * @author huangfu
 * @date 2020/10/11 21:42
 */
public class BusinessException extends RuntimeException implements IException {
    /**
     * 异常枚举
     */
    private final ExceptionEnum exceptionEnum;

    public BusinessException(ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMessage());
        this.exceptionEnum = exceptionEnum;
    }

    public BusinessException(ExceptionEnum exceptionEnum, Throwable throwable) {
        super(exceptionEnum.getMessage(), throwable);
        this.exceptionEnum = exceptionEnum;
    }

    @Override
    public ExceptionEnum getExceptionEnum() {
        return this.exceptionEnum;
    }

    /**
     * 异常转换
     *
     * @param exceptionEnum 异常枚举
     * @return 异常信息
     */
    public static BusinessException warp(ExceptionEnum exceptionEnum) {
        return new BusinessException(exceptionEnum);
    }

    /**
     * 异常转换
     *
     * @param exceptionEnum 异常枚举
     * @return 异常信息
     */
    public static BusinessException warp(ExceptionEnum exceptionEnum, Throwable throwable) {
        return new BusinessException(exceptionEnum, throwable);
    }

    /**
     * 获取并返回堆栈信息
     *
     * @param throwable 异常信息
     * @return 堆栈信息
     */
    public static String getErrorStack(Throwable throwable) {
        StringWriter sw = new StringWriter();
        try (PrintWriter pw = new PrintWriter(sw)) {
            throwable.printStackTrace(pw);
            return sw.toString();
        }
    }
}
