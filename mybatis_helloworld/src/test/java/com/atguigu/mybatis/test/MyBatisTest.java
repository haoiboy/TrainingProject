package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojp.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {

    @Test
    public void testInsert() throws IOException {
        //获取核心配置文件的输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取sqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //获取sql的会话对象SqlSession(不会自动提交事务),是mybatis提供的操作数据库的对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取sql的会话对象SqlSession(会自动提交事务),是mybatis提供的操作数据库的对象
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取UserMapper的代理实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //调用mapper接口中的方法，实现添加用户信息的功能
        int result = mapper.insertUser();
        //提供SQL以及的唯一标识找到SQL并执行，唯一标识是namespace.sqlId

//        int result = sqlSession.insert("com.atguigu.mybatis.mapper.UserMapper");
        System.out.println("结果:" + result);
        //提交事务
        sqlSession.commit();
        //关闭SqlSession
        sqlSession.close();
    }

    @Test
    public void testUpdate() {
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();
        sqlSession.close();
    }

    @Test
    public void testDelete() {
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser();
        sqlSession.close();
    }

    @Test
    public void testGetUserById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById();
        System.out.println(user);
    }

    @Test
    public void testGetAllUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlsession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.getAlluser();
        list.forEach(System.out::println);
    }
}
