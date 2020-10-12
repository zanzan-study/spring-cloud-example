package com.common.core.exceptions;

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
}
