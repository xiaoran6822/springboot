package com.xqh.dockngixmy.repository;

import com.xqh.dockngixmy.entity.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author：zhsz
 * @Description:
 * @Date:Created in 下午5:23 2019/4/16
 * @ModifiedBy:
 */
public interface  VisitorRepository extends JpaRepository<Visitor, Long> {
    Visitor findByIp(String ip);
}