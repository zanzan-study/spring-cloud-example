package com.common.exceptions;

/**
 * 通用的枚举定义
 *
 * @author huangfu
 */
public enum UnknownEnum implements ExceptionEnum {
    /**
     * 通用错误
     */
    UNKNOWN_EXCEPTION("500000", "发生未知错误，请联系管理员！"),
    /**
     * 通用成功
     */
    UNKNOWN_SUCCESS("000000", "成功");
    /**
     * 请求码
     */
    private final String code;
    /**
     * 消息
     */
    private final String message;

    UnknownEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}