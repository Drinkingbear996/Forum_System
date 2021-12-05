package com.hwc.test;

import com.hwc.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void test1() throws IOException {

    //加载核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

    //获得sqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

    //获得sqlSession会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);


    //执行sql语句 参数：UserMapper.xml中的 namespace+id
      User user= sqlSession.selectOne("userMapper.findAll",1);
        System.out.println(user);

    //释放资源
        sqlSession.close();


    }

    @Test
    public void test2() throws IOException {




        //加载核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        //获得sqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        //获得sqlSession会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();


        //模拟User对象,前端传过来的参数
        User user=new User();
        user.setUsername("tom");
        user.setPassword("abc");



        //执行sql语句 参数：UserMapper.xml中的 namespace+id 还有参数
        int insert = sqlSession.insert("userMapper.save",user);

        //提交事务
        sqlSession.commit();

        //打印结果
        System.out.println(insert);

        //释放资源
        sqlSession.close();


    }

    //修改
    @Test
    public void test3() throws IOException {




        //加载核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        //获得sqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        //获得sqlSession会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();


        //模拟User对象,前端传过来的参数
        User user=new User();
        user.setId(3);
        user.setUsername("lucy");
        user.setPassword("1234");



        //执行sql语句 参数：UserMapper.xml中的 namespace+id 还有参数
         sqlSession.update("userMapper.update",user);

        //提交事务
        sqlSession.commit();



        //释放资源
        sqlSession.close();


    }

    //删除
    @Test
    public void test4() throws IOException {




        //加载核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

        //获得sqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        //获得sqlSession会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();


        //模拟User对象,前端传过来的参数
        User user=new User();
        user.setId(5);




        //执行sql语句 参数：UserMapper.xml中的 namespace+id 还有传过来的参数
        sqlSession.update("userMapper.delete",user);

        //提交事务
        sqlSession.commit();



        //释放资源
        sqlSession.close();


    }


}
