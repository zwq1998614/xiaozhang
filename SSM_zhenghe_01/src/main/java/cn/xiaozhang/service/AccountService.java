package cn.xiaozhang.service;

import cn.xiaozhang.domain.Account;

import java.util.List;


public interface AccountService {
    /**
     * 查询所哟普账户信息
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存信息
     * @param account
     */
    public void saveAccount(Account account);

}
