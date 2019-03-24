package com.xqh.demoshujuku;

import com.xqh.demoshujuku.enums.UserSexEnum;
import com.xqh.demoshujuku.model.User;
import com.xqh.demoshujuku.rabbitSend.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author：zhsz
 * @Description:
 * @Date:Created in 下午4:13 2019/3/22
 * @ModifiedBy:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqHelloTest {
    @Autowired
    private HelloSender helloSender;

/*
    @Test
    public void hello() throws Exception {
        helloSender.send();
    }
*/


/*

    @Test
    public void oneToMany() throws Exception {
        for (int i=0;i<100;i++){
            helloSender.sendneo(i);
        }
    }
*/


    /*@Test
    public void manyToMany() throws Exception {
        for (int i=0;i<100;i++){
            helloSender.sendneo(i);
            helloSender.sendneo2(i);
        }
    }*/

  /*  @Test
    public void sendMultile() throws Exception {

        helloSender.sendMutiple(new User("aa1", "a123456", UserSexEnum.MAN));
    }*/

   /* @Test
    public void senTop() throws Exception {
        helloSender.sendTopic1();
        helloSender.sendTopic2();
        helloSender.sendTopic3();
    }
*/

    @Test
    public void sendFanout() throws Exception {
        helloSender.sendFanout();

    }


}
