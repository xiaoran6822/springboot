package com.xqh.demoshujuku.core;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Author：zhsz
 * @Description:
 * @Date:Created in 下午3:54 2019/3/22
 * @ModifiedBy:
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue Queue() {
        return new Queue("hello");
    }
}
