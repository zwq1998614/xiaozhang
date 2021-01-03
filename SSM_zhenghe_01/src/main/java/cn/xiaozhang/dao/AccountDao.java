package cn.xiaozhang.dao;

import cn.xiaozhang.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository//等于把它也交给IOC容器去管
public interface AccountDao {


    /**
     * 查询所哟普账户信息
     * @return
     */
    @Select("SELECT * FROM account ")
    public List<Account> findAll();

    /**
     * 保存信息
     * @param account
     */
    @Insert("insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);
}
