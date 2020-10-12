package com.common.core.exceptions;

/**
 * *********************************************************************
 * 异常接口
 * *********************************************************************
 *
 * @author huangfu
 * @date 2020/10/11 21:38
 */
public interface IException {
    /**
     * 获取异常枚举信息
     * @return 枚举信息
     */
    ExceptionEnum getExceptionEnum();
}
