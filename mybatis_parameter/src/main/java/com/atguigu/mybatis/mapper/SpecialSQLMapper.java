package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecialSQLMapper {
    /**
     * 通过用户名模糊查询用户信息
     * @param mohu
     * @return
     */
    List<User>getUserByLike(@Param("mohu")String mohu);
    /**
     *批量删除
     */
    void deleteMoreUser(@Param("ids") String ids);
    /**
     *动态设置表名，查询用户信息
     */
        List<User> getUserList(@Param("tablename")String tablename);
    /**
     *添加用户信息并获取自增的主键
     */
    void insertUser(User user);
}
