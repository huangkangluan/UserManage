package com.hzit.controller;

import com.hzit.dao.entity.User;
import com.hzit.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/10/13.
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("/login.do")
    public String login(@RequestParam("userName") String userName,@RequestParam("password") String password,HttpSession session){
        User user=loginService.login(userName,password);
        if (user!=null){
            session.setAttribute("user",user);
            return "usermanage";
        }else{
            return "redirect:/login.html";
        }
    }
}
