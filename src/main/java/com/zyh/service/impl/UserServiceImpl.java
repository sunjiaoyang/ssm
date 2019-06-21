package com.zyh.service.impl;

import com.zyh.dao.UserDao;
import com.zyh.entity.User;
import com.zyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public User findUserByid(int id) {
        return userDao.findUserById(id);
    }
}
