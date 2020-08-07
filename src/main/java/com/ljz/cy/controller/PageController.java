package com.ljz.cy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 此类作为项目中所有页面访问的入口
 */
@Controller
@RequestMapping("/")
public class PageController {

    /**
     * DB初始化页面呈现
     * @return
     */
    @RequestMapping("doIndexUI")
    public String doIndexUI(){
        return "starter";
    }

    /**
     * 返回一个日志页面
     * @return
     */
//    @RequestMapping("log/log_list")
//    public String doLogUI(){
//        return "sys/log_list";
//    }

    /**
     * 返回一个分页页面
     * @return
     */
    @RequestMapping("doPageUI")
    public String doPageUI(){
        return "common/page";
    }

    //rest风格(软件编码架构风格)的url定义
    //语法格式:/{a}/{b}/...;其中{}中的内容可以理解为一个变量
    //@PathVariable 注解可以描述方法参数，用于获取url中与方法参数相同的变量值
    @RequestMapping("{module}/{ModuleUI}")
    public String doModuleUI(@PathVariable String ModuleUI){
        System.out.println("==doModuleUI()==");
        return "sys/"+ModuleUI;
    }
}

