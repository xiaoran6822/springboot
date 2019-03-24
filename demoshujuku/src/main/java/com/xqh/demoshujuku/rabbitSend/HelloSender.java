package com.xqh.demoshujuku.rabbitSend;

import com.xqh.demoshujuku.model.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author：zhsz
 * @Description:
 * @Date:Created in 下午4:07 2019/3/22
 * @ModifiedBy:
 */
@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "Spring boot neo queue ****** "+new Date();
        this.rabbitTemplate.convertAndSend("hello", context);
    }

    public void sendneo(int i) {
        String context = "spirng boot neo queue"+" ****** "+i;
        this.rabbitTemplate.convertAndSend("neo", context);
    }

    public void sendneo2(int i) {
        String context = "spirng boot neo queue"+" ****** "+i;
        this.rabbitTemplate.convertAndSend("neo", context);
    }

    public void sendMutiple(User user) {
        this.rabbitTemplate.convertAndSend("object", user);
    }



    public void sendTopic1() {
        String context = "hi, i am message 1";

        this.rabbitTemplate.convertAndSend("topicExchange", "topic.message", context);
    }

    public void sendTopic2() {
        String context = "hi, i am messages 2";

        this.rabbitTemplate.convertAndSend("topicExchange", "topic.messages", context);
    }

    public void sendTopic3() {
        String context = "hi, i am message all";

        this.rabbitTemplate.convertAndSend("topicExchange", "topic.1", context);
    }


    public void sendFanout() {
        String context = "hi, fanout msg ";

        this.rabbitTemplate.convertAndSend("fanoutExchange","", context);
    }
}
