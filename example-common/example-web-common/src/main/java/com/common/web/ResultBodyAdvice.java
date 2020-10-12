package com.common.web;

import com.alibaba.fastjson.JSON;
import com.common.core.result.CommonResult;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

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
        return true;
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
