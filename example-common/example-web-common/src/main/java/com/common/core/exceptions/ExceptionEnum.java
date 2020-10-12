package com.common.core.exceptions;

/**
 * *********************************************************************
 * TODO
 * *********************************************************************
 *
 * @author huangfu
 * @date 2020/10/11 21:40
 */
public interface ExceptionEnum {
    /**
     * 获取错误码
     * @return 返回错误码
     */
    String getCode();

    /**
     * 获取错误信息
     * @return 返回错误信息
     */
    String getMessage();
}
