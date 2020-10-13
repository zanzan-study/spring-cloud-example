package com.common.web;

import com.alibaba.fastjson.JSON;
import com.common.annotations.ResultAutoWarp;
import com.common.core.result.CommonResult;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.lang.reflect.AnnotatedElement;

/**
 * *********************************************************************
 * 全局结果集封装
 * *********************************************************************
 *
 * @author huangfu
 * @date 2020/10/11 21:57
 */
@RestControllerAdvice
public class ResultBodyAdvice implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        AnnotatedElement annotatedElement = returnType.getAnnotatedElement();
        //获取主体类名
        Class<?> declaringClass = returnType.getDeclaringClass();
        boolean classMark = false;
        //获取类上的注解标识
        if(declaringClass.isAnnotationPresent(ResultAutoWarp.class)){
            classMark = declaringClass.getAnnotation(ResultAutoWarp.class).value();
        }

        if (annotatedElement.isAnnotationPresent(ResultAutoWarp.class)) {
            ResultAutoWarp annotation = annotatedElement.getAnnotation(ResultAutoWarp.class);
            return annotation.value();
        }
        return classMark;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {

        if (body instanceof CommonResult) {
            return body;
        }

        if (body instanceof String) {
            return CommonResult.ok(JSON.toJSONString(body));
        }

        return CommonResult.ok(body);
    }
}
