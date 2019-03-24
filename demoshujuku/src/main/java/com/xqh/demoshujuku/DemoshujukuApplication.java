package com.xqh.demoshujuku;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
//@MapperScan("com.xqh.demoshujuku.mapper")
@EnableScheduling
public class DemoshujukuApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoshujukuApplication.class, args);
    }

}
