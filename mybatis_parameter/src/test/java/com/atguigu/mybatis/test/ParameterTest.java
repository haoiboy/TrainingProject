package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ParameterTest {
    @Test
    public void testGetUserByUsername(){
        SqlSession sqlSession= SqlSessionUtil.getSqlsession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        User user=mapper.getUserByUsername("admin");
        System.out.println(user);
    }
    @Test
    public void testcheckLogin(){
        SqlSession sqlSession= SqlSessionUtil.getSqlsession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
       User  user=mapper.checkLogin("admin","123456");
        System.out.println(user);

    }
    @Test
    public void testcheckLoginByMap(){
        SqlSession sqlSession= SqlSessionUtil.getSqlsession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        Map<String,Object>map=new HashMap<>();
        map.put("username","admin");
        map.put("passwprd","123456");
        User  user=mapper.checkLoginByMap(map);
        System.out.println(user);
    }
        @Test
        public void testInterUser(){
        SqlSession sqlSession= SqlSessionUtil.getSqlsession();
            UserMapper mapper=sqlSession.getMapper(UserMapper.class);
            User user=new User(null,"root","123456",33,"女","123@qq.com");
         mapper.insertUser(user);
    }
    @Test
    public void testcheckLoginByParam() {
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginByparam("admin", "123456");
        System.out.println(user);
    }}
