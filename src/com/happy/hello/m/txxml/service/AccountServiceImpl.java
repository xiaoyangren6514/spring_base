package com.happy.hello.m.txxml.service;

import com.happy.hello.m.txxml.dao.AccountDao;

/**
 * Created by zhonglq on 2018/6/24.
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    @Override
    public void transfer(int from, int to, double money) {
        accountDao.increaseMoney(to, money);
//        System.out.println(1 / 0);
        accountDao.decreaseMoney(from, money);
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

}
