package com.happy.hello.n.txannotation;

import com.happy.hello.n.txannotation.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by zhonglq on 2018/6/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/happy/hello/n/txannotation/applicationContext.xml")
public class TransactionAnnotationTest {

    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void test01() {
        accountService.transfer(2, 1, 100);
    }

}
