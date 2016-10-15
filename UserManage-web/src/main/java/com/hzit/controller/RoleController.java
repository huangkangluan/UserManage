package com.hzit.controller;

import com.hzit.dao.entity.Role;
import com.hzit.dao.entity.User;
import com.hzit.dao.vo.RoleVo;
import com.hzit.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
@Controller
public class RoleController {
    @Autowired
    private RoleService roleService;
    @RequestMapping("/addrole.do")
    public String addrole(){
        return "addrole";
    }
    @RequestMapping("/findrole.do")
    public String findrole(ModelMap modelMap){
        List<Role> list=roleService.findRole(null);
        modelMap.put("roleList",list);
        return "findrole";
    }
    @RequestMapping("/addroleName")
    @ResponseBody
    public boolean addroleName(Role role){
        boolean boo=roleService.insertRole(role);
        return boo;
    }
}
