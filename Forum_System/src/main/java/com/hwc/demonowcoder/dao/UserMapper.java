package com.hwc.demonowcoder.dao;

import com.hwc.demonowcoder.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String name);

    User selectByEmail(String email);

    /**
     * 注册用户
     **/
    int insertUser(User user);

    /**
     * 邮件激活
     **/
    int updateStatus(@Param("id") int id, @Param("status") int status);

    /**
     * 上传头像
     **/
    int updateHeader(@Param("id") int id, @Param("headerUrl") String headerUrl);

    /**
     * 修改密码
     **/
    int updatePassword(@Param("id") int id, @Param("password") String password);
    //一定要加@Param("")与mapper.xml中的#{ }匹配

}
