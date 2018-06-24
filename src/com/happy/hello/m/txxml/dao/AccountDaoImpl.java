package com.happy.hello.m.txxml.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by zhonglq on 2018/6/24.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    @Override
    public void increaseMoney(int id, double money) {
        String sql = "update account set money=money+? where id = ?";
        getJdbcTemplate().update(sql, money, id);
    }

    @Override
    public void decreaseMoney(int id, double money) {
        String sql = "update account set money=money-? where id = ?";
        getJdbcTemplate().update(sql, money, id);
    }

}
