package com.xqh.purespringboot.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author：zhsz
 * @Description:
 * @Date:Created in 下午3:39 2019/3/21
 * @ModifiedBy:
 */
@Component
public class NeoProperties {
    @Value("${com.xqh.title}")
    private String title;
    @Value("${com.xqh.description}")
    private String description;

    //省略getter settet方法

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
