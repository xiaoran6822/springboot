package com.xqh.demoshujuku.rabbitReceive;

import com.xqh.demoshujuku.model.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author：zhsz
 * @Description:
 * @Date:Created in 下午5:42 2019/3/22
 * @ModifiedBy:
 */

@Component
@RabbitListener(queues = "topic.messages")
public class TopicReceiver2 {
    @RabbitHandler
    public void process(String str) {
        System.out.println("topic.messages : " + str);
    }
}
