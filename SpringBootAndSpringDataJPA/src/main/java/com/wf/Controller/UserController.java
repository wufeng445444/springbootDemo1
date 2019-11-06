package com.wf.Controller;

import com.wf.dao.UserDao;
import com.wf.entity.User;
import com.wf.mapper.UserMapper;
import com.wf.pojo.MUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
@Autowired
private UserDao userDao;
@Autowired
private UserMapper userMapper;

@RequestMapping("/user/list")
public List<User> getUser(){
    return  userDao.findAll();
}
@RequestMapping("/muser/list")
    public List<MUser> getMUser(){
    return userMapper.getUserList();
}
}
