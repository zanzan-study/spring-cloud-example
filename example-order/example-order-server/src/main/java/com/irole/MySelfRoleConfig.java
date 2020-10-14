package com.irole;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义扫描规则
 * 注意：不能放在启动类能够扫描的包下，否则会被全局共享！当然，如果你想全局共享的话就无所谓
 * 如果想要针对不同的服务，使用不同的配置，那么就要放在扫描包外！  然后早启动类上做对应配置 {@link com.example.order.OrderApplication}
 * @date 2020年10月14日15:54:30
 * @author huangfu
 */
@Configuration
public class MySelfRoleConfig {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
