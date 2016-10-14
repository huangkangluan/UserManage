package com.hzit.controller;

import com.hzit.dao.entity.Role;
import com.hzit.dao.entity.User;
import com.hzit.dao.vo.RoleVo;
import com.hzit.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
@Controller
public class RoleController {
    @Autowired
    private RoleService roleService;
    @RequestMapping("/findRoleModule")
    public String findRoleModule(ModelMap modelMap,HttpSession session){
        User user= (User) session.getAttribute("user");
        List<RoleVo> list=roleService.findRole(user.getUserId());
        modelMap.put("list",list);
        modelMap.put("user",user);
        return "usermanage";
    }
}
