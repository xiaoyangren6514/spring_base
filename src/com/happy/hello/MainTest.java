package com.happy.hello;

import com.happy.hello.a.rumen.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhonglongquan on 2018/6/21.
 */
public class MainTest {

    public static void main(String[] args) {
        // 创建容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从容器获取对象
        User user = applicationContext.getBean(User.class);
        user.setName("wangcai");
        System.out.println(user.getName());
    }

}
