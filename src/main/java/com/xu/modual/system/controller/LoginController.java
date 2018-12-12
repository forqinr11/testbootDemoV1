package com.xu.modual.system.controller;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xu.modual.system.model.SysUser;
import com.xu.modual.system.service.SysUserService;

@Controller
public class LoginController {

    @Autowired
    private SysUserService sysUserServiceImpl;


    /**
     * 日志管理
     */
    private static Logger log = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping("toDemo")
    public ModelAndView getLogin(ModelAndView mv){
        log.info("====>>跳转freemarker页面");
        mv.addObject("name", "jack");
        mv.setViewName("freemarker");
        return mv;
    }

    @RequestMapping("/")
    public String getLogin(){
        log.info("====>>跳转login页面");
        return "login";
    }

    @RequestMapping("/login")
    public String login(SysUser user) {
        String username=user.getUsername();
        /*String password=user.getPassword();*/

       SysUser sysUser=sysUserServiceImpl.getUserInfo(username);

        System.out.println(sysUser.getDisplayName());
        return "index";
    }
}
