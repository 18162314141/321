package com.qs.bootdemo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
@RequestMapping("/test")
    public String testController(String name){
            return "hello"+name;
}
@RequestMapping("/test2")
    public String testController2(User user){
    return "编号:"+user.getId()+"姓名"+user.getUname();
}
@RequestMapping("/{uname}/{upwd}")
    public String testController3(@PathVariable("uname") String name, @PathVariable("upwd") String pwd){
    System.out.println("restful风格?");
    return "restful风格，获取值："+name+"  密码："+pwd;
}
}
