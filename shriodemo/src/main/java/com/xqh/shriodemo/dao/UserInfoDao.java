package com.xqh.shriodemo.dao;

import com.xqh.shriodemo.model.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author：zhsz
 * @Description:
 * @Date:Created in 下午5:54 2019/4/1
 * @ModifiedBy:
 */
public interface UserInfoDao extends CrudRepository<UserInfo,Long> {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
