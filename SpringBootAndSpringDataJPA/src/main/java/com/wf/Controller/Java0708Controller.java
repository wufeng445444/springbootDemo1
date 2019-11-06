package com.wf.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Java0708Controller {
    @RequestMapping("/hello")
public Map sayHello(){
    Map<String,Object> map=new HashMap<>();
    map.put("Java0708","恶魔的开始");
    return map;
}
}
