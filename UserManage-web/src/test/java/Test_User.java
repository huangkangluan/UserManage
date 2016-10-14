import com.hzit.StartWebApp;
import com.hzit.dao.entity.Rolemodule;
import com.hzit.service.RoleModuleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value = StartWebApp.class)
public class Test_User {
    @Autowired
    private RoleModuleService roleModuleService;

    @Test
    public void login(){
        Map map=new HashMap();
        map.put("roleId",1);
       List<Rolemodule> list=roleModuleService.findRoleModule(map);
        for (Rolemodule r:list){
            System.out.println(r.getModuleId());
        }
}
}
