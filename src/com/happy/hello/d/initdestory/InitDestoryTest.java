package com.happy.hello.d.initdestory;

import com.happy.hello.d.initdestory.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhonglongquan on 2018/6/21.
 */
public class InitDestoryTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/happy/hello/d/initdestory/applicationContext.xml");
        Student student = (Student) applicationContext.getBean("student");
        student.setName("测试init和destory");
        System.out.println(student.getName());
        // 手动关闭容器
        applicationContext.close();
    }
}
