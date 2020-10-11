package com.common.annotations;

import java.lang.annotation.*;

/**
 * *********************************************************************
 * 标识结果集是否自动包装
 * *********************************************************************
 *
 * @author huangfu
 * @date 2020/10/11 22:00
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ResultAutoWarp {
}
