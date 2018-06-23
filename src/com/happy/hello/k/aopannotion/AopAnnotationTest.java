package com.happy.hello.k.aopannotion;

import com.happy.hello.k.aopannotion.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by zhonglongquan on 2018/6/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/happy/hello/k/aopannotion/applicationContext.xml")
public class AopAnnotationTest {

    @Resource(name = "userService")
    private UserService userService;

    @Test
    public void test(){
        userService.add();
    }

}
