package com.wf.Controller;

import com.wf.dao.UserDao;
import com.wf.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
//这个地方只能用Controller不能用RestController
@Controller
public class PageController {
  @Autowired
  UserDao userDao;
  @Value("${page.rows}")
  private Integer rows;

    @RequestMapping("/page/user/list")
    public String pageList(Model model){
        List<User> userList = userDao.findAll();
        model.addAttribute("userList",userList);
        return "demo";
    }

    @RequestMapping("page/rows")
    @ResponseBody
    public Map getRows(){
        Map map=new HashMap();
        map.put("rows",rows);
        return map;
    }

}
