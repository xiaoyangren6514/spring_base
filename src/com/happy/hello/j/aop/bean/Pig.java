package com.happy.hello.j.aop.bean;

import org.springframework.stereotype.Component;

/**
 * Created by zhonglongquan on 2018/6/22.
 */
@Component(value = "pig")
public class Pig {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
