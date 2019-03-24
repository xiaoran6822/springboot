package com.xqh.demoshujuku.rabbitReceive;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author：zhsz
 * @Description:
 * @Date:Created in 下午3:09 2019/3/23
 * @ModifiedBy:
 */
@Component
@RabbitListener(queues = "fanout.C")
public class FanoutReceiverC {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("ReceiverC  : " + hello);
    }

}
