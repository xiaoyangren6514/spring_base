package com.happy.hello.i.junit;

import com.happy.hello.i.junit.bean.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by zhonglongquan on 2018/6/22.
 */
// 创建容器
@RunWith(SpringJUnit4ClassRunner.class)
// 指定XML配置文件
@ContextConfiguration("classpath:com/happy/hello/i/junit/applicationContext.xml")
public class JunitTest {

    // 将名为cat的对象注入到cat变量中
    @Resource(name = "cat")
    private Cat cat;

    @Test
    public void fun1() {
        System.out.println(cat.toString());
    }

    @Test
    public void test() {
        System.out.println("12");
    }

}
