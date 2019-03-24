package com.xqh.demoshujuku.rabbitReceive;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author：zhsz
 * @Description:
 * @Date:Created in 下午3:05 2019/3/23
 * @ModifiedBy:
 */
@Component
@RabbitListener(queues = "fanout.B")
public class FanoutReceiverB {
    @RabbitHandler
    public void process(String hello) {

        System.out.println("ReceiverB  : " + hello);
    }
}

