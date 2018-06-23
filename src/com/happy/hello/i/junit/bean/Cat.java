package com.happy.hello.i.junit.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by zhonglongquan on 2018/6/22.
 */
@Component(value = "cat")
public class Cat {

    @Value("xiaoming")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

}
