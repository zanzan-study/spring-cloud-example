package com.common.annotations;

import java.lang.annotation.*;

/**
 * 该方法是否被自动包装
 * @author huangfu
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface ResultAutoWarp {
    boolean value() default true;
}
