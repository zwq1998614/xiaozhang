package cn.xiaozhang.controller;

import cn.xiaozhang.domain.Account;
import cn.xiaozhang.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class Accountcontroller {


    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){

        System.out.println("表现层：查询所有账户");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }
    @RequestMapping("/saveAccount")
    public void saveAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {

        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");

    }

}

