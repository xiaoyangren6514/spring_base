package com.happy.hello.d.initdestory.bean;

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

    /**
     * 容器初始化对象是，会调用此方法，在构造方法之后
     */
    public void init() {
        System.out.println("init called");
    }

    /**
     * 容器被关闭时，bean对象会调用此方法
     */
    public void destory() {
        System.out.println("destory called");
    }
}
