package com.example.systemspringboot.dao;

import com.example.systemspringboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * @author 马欢欢
 * @date 2018/3/5
 */
@Mapper
public interface UserDao {
    /**
     * 查找用户信息
     * @return 所有用户信息
     */
    List<User> queryUserInfo() throws Exception;
}
