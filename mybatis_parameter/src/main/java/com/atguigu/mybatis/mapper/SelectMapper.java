package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {

    /**
     * 根据ID查询用户信息
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);
    /**
     * 查询所有用户信息
     */
    List<User> getAllUser();
    /**
     * 查询用户的总数量
     */
    Integer getCount();
    /**
     * 根据ID查询用户信息为map集合
     */
    Map<String,Object> getUserByIdToMap(@Param("id") Integer id);
    /**
     * 查询所有的用户信息为map集合
     */
   // List<Map<String,Object>>getAllUserToMap();
    @MapKey("id")
    Map<String,Object>getAllUserToMap();
}
