package com.itheima.dao.impl;

import com.itheima.dao.UserMapper;
import com.itheima.domain.User;
import org.apache.ibatis.builder.SqlSourceBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserMapperimpl  implements UserMapper {
    public List<User> findAll() throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");


        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession=sqlSessionFactory.openSession(true);
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);


        List<User> list=sqlSession.selectList("userMapper.findAll");

        return  list;

    }

    public User findById(int id) {
        return null;
    }
}
