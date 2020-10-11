package com.common.config;

import com.common.web.ExampleExceptionHandle;
import com.common.web.ResultBodyAdvice;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * *********************************************************************
 * 结果集配置信息
 * *********************************************************************
 *
 * @author huangfu
 * @date 2020/10/11 23:43
 */
@Configuration
@ConditionalOnClass({DispatcherServlet.class})
public class SpringWebConfig {
    @Bean
    public ResultBodyAdvice resultBodyAdvice() {
        return new ResultBodyAdvice();
    }

    @Bean
    public ExampleExceptionHandle exampleExceptionHandle() {
        return new ExampleExceptionHandle();
    }
}
