package com.service;

import com.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.persistence.UserMapper;

/**
 * Created by py on 2017/3/23.
 */
@Service("userService")
public class UserService implements IUserService{

    @Autowired
    private UserMapper userMapper;

    public User getUserById(int userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
