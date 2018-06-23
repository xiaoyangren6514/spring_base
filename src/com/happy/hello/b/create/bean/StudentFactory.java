package com.happy.hello.b.create.bean;

/**
 * Created by zhonglongquan on 2018/6/21.
 */
public class StudentFactory {
    /**
     * 静态工厂创建bean
     *
     * @return
     */
    public static Student createStudent() {
        System.out.println("StudentFactory createInstance called");
        return new Student();
    }
}
