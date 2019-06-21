package com.zyh.dao;

import com.zyh.entity.User;

public interface UserDao {
    User findUserById(int id);
}
