package com.happy.hello.l.jdbc.dao;

import com.happy.hello.l.jdbc.domain.User;

import java.util.List;

/**
 * Created by zhonglq on 2018/6/23.
 */
public interface UserDao {
    void add(User user);
    void delete(int uid);
    void update(User user);
    List<User> findAll();
    User findById(int id);
}
