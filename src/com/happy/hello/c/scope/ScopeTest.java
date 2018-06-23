package com.happy.hello.c.scope;

import com.happy.hello.b.create.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhonglongquan on 2018/6/21.
 */
public class ScopeTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/happy/hello/c/scope/applicationContext.xml");
        Student student = (Student) applicationContext.getBean("student");
        Student student2 = (Student) applicationContext.getBean("student");
        student.setName("旺财");
        System.out.println(student.getName());
        System.out.println(student == student2);
    }
}
