package com.happy.hello.n.txannotation.dao;

/**
 * Created by zhonglq on 2018/6/24.
 */
public interface AccountDao {

    /**
     * 转账，收钱方
     *
     * @param id    收钱方账户ID
     * @param money 转入金额
     */
    void increaseMoney(int id, double money);

    /**
     * 转账，转账方
     *
     * @param id    转账方ID
     * @param money 转出金额
     */
    void decreaseMoney(int id, double money);

}
