package com.atguigu.mybatis.pojo.mapper;

import com.atguigu.mybatis.pojo.User;

import javax.swing.*;
import java.util.List;

public interface UserMapper {
    /**
     * 添加用户信息
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * 删除用户信息
     */
    void deleteUser();

    /**
     * 根据ID查询用户信息
     * @return
     */
    User getUserById();
    /**
     *查询所有的用户信息
     */
     List<User> getAllUser();
}
