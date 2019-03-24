package com.xqh.demoshujuku.rabbitReceive;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author：zhsz
 * @Description:
 * @Date:Created in 下午4:51 2019/3/22
 * @ModifiedBy:
 */
@Component
@RabbitListener(queues = "neo")
public class Hello2Receiver {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver2  : " + hello);
    }
}
