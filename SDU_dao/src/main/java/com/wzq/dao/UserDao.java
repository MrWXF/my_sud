package com.wzq.dao;

import com.wzq.model.User;
import org.apache.ibatis.annotations.Select;

public interface UserDao {

    @Select("select * from users where username=#{username}")
    public User findById(String username) throws Exception;
}
