package com.xqh.demoshujuku.rabbitReceive;

import com.xqh.demoshujuku.model.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author：zhsz
 * @Description:
 * @Date:Created in 下午5:22 2019/3/22
 * @ModifiedBy:
 */
@Component
@RabbitListener(queues = "object")
public class ObjectReceiver {
    @RabbitHandler
    public void process(User user) {
        System.out.println("Receiver object : " + user);
    }
}
