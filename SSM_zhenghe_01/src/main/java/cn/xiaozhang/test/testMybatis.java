package cn.xiaozhang.test;

import cn.xiaozhang.dao.AccountDao;
import cn.xiaozhang.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class testMybatis {



    @Test
    public void test01() throws IOException {


        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("SqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = builder.build(is);
        SqlSession session = build.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);

        List<Account> list = dao.findAll();
        for (Account account : list) {
            System.out.println(account);
            
        }
        is.close();
        session.close();

    }


    /**
     * 测试保存
     * @throws IOException
     */
    @Test
    public void test02() throws IOException {


        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("SqlMapConfig.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = builder.build(is);
        SqlSession session = build.openSession();
        AccountDao dao = session.getMapper(AccountDao.class);


        Account account=new Account();
        account.setId(5);
        account.setName("zhang");
        account.setMoney(30d);
        dao.saveAccount(account);
        session.commit();


        List<Account> list = dao.findAll();
        for (Account accounts : list) {
            System.out.println(accounts);

        }
        is.close();
        session.close();

    }
}
