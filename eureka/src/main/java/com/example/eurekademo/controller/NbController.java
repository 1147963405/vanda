package com.example.eurekademo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liyuwu
 * @description 测试用接口
 * @date 2020/6/30 11:31
 */
@RestController
public class NbController {

    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public String insert(Model m){

        Map<String,Object> map=new HashMap<>();
        map.put("001","张三");
        m.addAllAttributes(map);

        return  "测试成功";
    }

}
