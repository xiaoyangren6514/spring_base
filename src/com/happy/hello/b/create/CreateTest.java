package com.happy.hello.b.create;

import com.happy.hello.b.create.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhonglongquan on 2018/6/21.
 */
public class CreateTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/happy/hello/b/create/applicationContext.xml");
        Student student = (Student) applicationContext.getBean("student");
        student.setName("旺财");
        System.out.println(student.getName());
    }
}
