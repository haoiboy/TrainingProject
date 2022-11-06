package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojp.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserMapper {
    /**
     * 添加用户信息
     *
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    //删除用户信息
    void deleteUser();

    /**
     * 根据id查询用户信息
     *
     * @return
     */
    User getUserById();

    List<User> getAlluser();
}
