package com.happy.hello.k.aopannotion.service;

import org.springframework.stereotype.Service;

/**
 * Created by zhonglongquan on 2018/6/23.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void query() {
        System.out.println("query");
    }
}
