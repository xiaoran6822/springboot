package com.xqh.purespringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：zhsz
 * @Description:
 * @Date:Created in 下午3:12 2019/3/21
 * @ModifiedBy:
 */
@RestController
public class HelloWorldController {


    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

}
