package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ParameterTest {
    @Test
    public void testGetUserByUsername(){
        SqlSession sqlSession= SqlSessionUtil.getSqlsession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        User user=mapper.getUserByUsername("admin");
        System.out.println(user);
    }
}
