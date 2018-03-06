package com.example.systemspringboot.service.impl;

import com.example.systemspringboot.dao.UserDao;
import com.example.systemspringboot.entity.User;
import com.example.systemspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author 马欢欢
 * @date 2018/3/5
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryUserInfo() throws Exception{
        return userDao.queryUserInfo();
    }
}
