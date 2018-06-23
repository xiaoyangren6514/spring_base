package com.happy.hello.j.aop;

import com.happy.hello.j.aop.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by zhonglongquan on 2018/6/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/happy/hello/j/aop/applicationContext.xml")
public class AopTest {

    @Resource(name = "userService")
    private UserService userService;

    @Test
    public void test(){
        userService.add();
    }

}
