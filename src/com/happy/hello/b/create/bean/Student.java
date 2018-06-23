package com.happy.hello.b.create.bean;

/**
 * Created by zhonglongquan on 2018/6/21.
 */
public class Student {
    private String name;

    public Student() {
        System.out.println("student controtor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
