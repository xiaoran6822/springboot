package com.xqh.shriodemo.service;

import com.xqh.shriodemo.model.UserInfo;

/**
 * @Author：zhsz
 * @Description:
 * @Date:Created in 上午9:39 2019/4/2
 * @ModifiedBy:
 */
public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
