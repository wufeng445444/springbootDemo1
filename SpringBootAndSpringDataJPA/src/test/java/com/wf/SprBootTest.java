package com.wf;

import com.wf.mapper.UserMapper;
import com.wf.pojo.MUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class SprBootTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisTemplate redisTemplate;
 @Test
    public void userTest(){
        List<MUser> userList = userMapper.getUserList();
        for (MUser mUser : userList) {
            System.out.println(mUser);
        }

    }

    @Test
    public  void  testRedisTemplate(){
//     存到Redis的数据库
            redisTemplate.opsForValue().set("hello","0708java");
//     取
        String str =(String) redisTemplate.opsForValue().get("hello");
        System.out.println(str);
        MUser user=new MUser();
        user.setId(1);
        user.setUsername("admin");
        user.setPassword("123");
        user.setName("超人");
//        直接将对象存进去
        redisTemplate.opsForValue().set("user",user);
//取
        MUser user1 =(MUser)redisTemplate.opsForValue().get("user");
        System.out.println(user1);

    }

}
