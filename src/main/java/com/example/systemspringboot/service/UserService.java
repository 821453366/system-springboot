package com.example.systemspringboot.service;

import com.example.systemspringboot.entity.User;

import java.util.*;

/**
 *
 * @author 马欢欢
 * @date 2018/3/5
 */
public interface UserService {
    /**
     * 查找用户信息
     * @return 所有用户信息
     */
    List<User> queryUserInfo() throws Exception;
}
