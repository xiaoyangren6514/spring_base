package com.happy.hello.h.annotation;

import com.happy.hello.h.annotation.bean.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhonglongquan on 2018/6/22.
 */
public class AnnotationTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/happy/hello/h/annotation/applicationContext.xml");
        Dog dog = (Dog) applicationContext.getBean("dog");
//        dog.setName("旺财");
        System.out.println(dog.toString());
    }
}
