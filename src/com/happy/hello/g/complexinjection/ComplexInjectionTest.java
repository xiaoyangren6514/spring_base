package com.happy.hello.g.complexinjection;

import com.happy.hello.g.complexinjection.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhonglongquan on 2018/6/21.
 */
public class ComplexInjectionTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/happy/hello/g/complexinjection/applicationContext.xml");
        User user = applicationContext.getBean(User.class);
        System.out.println(user.toString());
    }
}
