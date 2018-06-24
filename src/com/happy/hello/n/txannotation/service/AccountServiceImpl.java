package com.happy.hello.n.txannotation.service;

import com.happy.hello.n.txannotation.dao.AccountDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by zhonglq on 2018/6/24.
 */
@Service(value = "accountService")
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = true)
public class AccountServiceImpl implements AccountService {

    @Resource(name = "accountDao")
    private AccountDao accountDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, readOnly = false)
    public void transfer(int from, int to, double money) {
        accountDao.increaseMoney(to, money);
        System.out.println(1 / 0);
        accountDao.decreaseMoney(from, money);
    }


}
