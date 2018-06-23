package com.happy.hello.f.injection.bean;

/**
 * Created by zhonglongquan on 2018/6/21.
 * 通过set方法注入
 */
public class Teacher {
    private Address address;
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
