package cn.xiaozhang.test;

import cn.xiaozhang.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {



    @Test
    public void test01(){
        //加载配置文件
        ApplicationContext application=new ClassPathXmlApplicationContext("classpath:applicationcontent.xml");
        System.out.println(application);
        //获取对象
        AccountService accountService = (AccountService) application.getBean("accountService");
        accountService.findAll();


    }
}
