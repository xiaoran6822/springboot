package com.xqh.demoshujuku.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author：zhsz
 * @Description:
 * @Date:Created in 下午3:26 2019/3/23
 * @ModifiedBy:
 */
@Component
public class Scheduler1Task {
    private int count=0;

    @Scheduled(cron="*/6 * * * * ?")
    private void process(){
        System.out.println("this is scheduler task runing  "+(count++));
    }
}
