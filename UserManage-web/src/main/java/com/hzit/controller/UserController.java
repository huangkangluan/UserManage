package com.hzit.controller;

import com.hzit.dao.entity.Module;
import com.hzit.dao.entity.Rolemodule;
import com.hzit.dao.entity.User;
import com.hzit.dao.vo.UserVo;
import com.hzit.service.ModuleService;
import com.hzit.service.RoleModuleService;
import com.hzit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/14.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleModuleService roleModuleService;
    @Autowired
    private ModuleService moduleService;
    @RequestMapping("/login.do")
    public String login(@RequestParam("userName") String userName,@RequestParam("password") String password,HttpSession session,ModelMap modelMap){
        User user=userService.login(userName,password);
        //判断用户是否为空
        if (user!=null){
            //判断用户名和密码是否正确
            if (userName.equals(user.getUserName()) && password.equals(user.getPassword())){
                session.setAttribute("user",user);
                //创建一个UserVo对象，把登录用户的信息给该对象赋值
                UserVo userVo=new UserVo();
                userVo.setUserId(user.getUserId());
                userVo.setUserName(user.getUserName());
                userVo.setPassword(user.getPassword());
                userVo.setIsdelete(user.getIsdelete());
                userVo.setRoleId(user.getRoleId());
                //创建一个Map集合，把角色ID赋值进去封装Map集合中
                Map map=new HashMap();
                map.put("roleId",userVo.getRoleId());
                //调用角色和模块的关联表的查询方法，用list集合接收
                List<Rolemodule> rolemoduleList=roleModuleService.findRoleModule(map);
                //创建一个Module的集合
                List<Module> moduleList=new ArrayList<Module>();
                for (Rolemodule r:rolemoduleList){
                    //创建一个Map集合
                    Map modulemap=new HashMap();
                    //把Rolemodule关联表中的模块ID封装到Map集合当中
                    modulemap.put("moduleId",r.getModuleId());
                    //调用模块表中的查询方法，把Map集合中的模块ID赋值进去查询
                    List<Module> list=moduleService.findModule(modulemap);
                    //每查询到一条模块ID的数据，就添加一次当前数据到moduleList中
                    moduleList.add(list.get(0));
                }
                //循环完之后，给UserVo里的moduleList属性赋值
                userVo.setModuleList(moduleList);
                //把userVo中的数据封装在session对象中
                session.setAttribute("userVo",userVo);
                System.out.println(userVo.toString());
                return "usermanage";
            }else{
                return "redirect:/login.html";
            }
        }else{
            return "redirect:/login.html";
        }
    }

}
