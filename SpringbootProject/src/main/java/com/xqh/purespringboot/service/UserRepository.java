package com.xqh.purespringboot.service;

import com.xqh.purespringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author：zhsz
 * @Description:
 * @Date:Created in 下午4:02 2019/3/21
 * @ModifiedBy:
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
}