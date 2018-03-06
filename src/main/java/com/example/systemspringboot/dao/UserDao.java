package com.example.systemspringboot.dao;

import com.example.systemspringboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author 马欢欢
 * @date 2018/3/5
 */
//@Mapper 在主程序开通@MapperScan后不需要此注解

@Repository
public interface UserDao {
    /**
     * 查找用户信息
     * @return 所有用户信息
     */
    List<User> queryUserInfo() throws Exception;
}
