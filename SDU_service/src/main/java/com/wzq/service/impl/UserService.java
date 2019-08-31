package com.wzq.service.impl;

import com.wzq.dao.UserDao;
import com.wzq.model.User;
import com.wzq.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("userService")
@Transactional
public class UserService implements IUserService {
    @Autowired
    private UserDao userDao;

    public UserDetails loadUserByUsername(String username) {
        User user = null;
        try {
            user = userDao.findById(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        处理自己的user对象封装成UserDetails对象
        org.springframework.security.core.userdetails.User user1 =
                new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),null);

        return user1;
    }
}
