package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SpecialSQLMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import com.sun.media.jfxmediaimpl.HostUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.sql.*;
import java.util.List;

public class SpecialSQLMapperTest {
    @Test
    public void testGetUserByLike() {
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserByLike("a");
        list.forEach(System.out::println);

    }

    @Test
    public void testDeleteMoreUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        mapper.deleteMoreUser("9,10");
    }

    @Test
    public void testGetUserList() {
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserList("t_user");
        list.forEach(System.out::println);

    }

    public void testJDBC() throws ClassNotFoundException {
        try {
            Class.forName("");
            Connection connection = DriverManager.getConnection("", "", "");
            String sql = "insert into t_user values()";
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();
            ResultSet resultSet = ps.getGeneratedKeys();
            resultSet.next();
            int id = resultSet.getInt(1);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testInsertUser(){
        SqlSession sqlSession=SqlSessionUtil.getSqlsession();
        SpecialSQLMapper mapper=sqlSession.getMapper(SpecialSQLMapper.class);
        User user = new User(null,"xiaoming","123456",23,"男","123@qq.com");
        mapper.insertUser(user);
        System.out.println(user);

    }
}
