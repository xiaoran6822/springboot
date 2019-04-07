package com.xqh.shriodemo.service.impl;

import com.xqh.shriodemo.dao.UserInfoDao;
import com.xqh.shriodemo.model.UserInfo;
import com.xqh.shriodemo.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author：zhsz
 * @Description:
 * @Date:Created in 上午9:40 2019/4/2
 * @ModifiedBy:
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}