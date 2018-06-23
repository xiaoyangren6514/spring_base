package com.happy.hello.b.create.bean;

/**
 * Created by zhonglongquan on 2018/6/21.
 */
public class InstanceFactory {

    /**
     * 实例工厂
     *
     * @return
     */
    public Student createStudent() {
        System.out.println("InstanceFactory createStudent");
        return new Student();
    }

}
