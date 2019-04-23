package com.xqh.dockngixmy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author：zhsz
 * @Description:
 * @Date:Created in 下午5:22 2019/4/16
 * @ModifiedBy:
 */
@Entity
public class Visitor {
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private  long  times;
    @Column(nullable = false)
    private  String  ip;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTimes() {
        return times;
    }

    public void setTimes(long times) {
        this.times = times;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
