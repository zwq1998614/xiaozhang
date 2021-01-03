package cn.xiaozhang.service.impl;

import cn.xiaozhang.dao.AccountDao;
import cn.xiaozhang.domain.Account;
import cn.xiaozhang.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;
    public List<Account> findAll() {
        System.out.println("业务层查询所有的信息");
        return accountDao.findAll();
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
        System.out.println("业务层保存信息");

    }
}
