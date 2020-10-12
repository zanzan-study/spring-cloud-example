package com.common.core.utils;

import java.io.PrintWriter;
import java.io.StringWriter;
/**
 * *********************************************************************
 * 日志工具类
 * *********************************************************************
 *
 * @author huangfu
 * @date 2020/10/11 21:38
 */
public class LogUtil {
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
