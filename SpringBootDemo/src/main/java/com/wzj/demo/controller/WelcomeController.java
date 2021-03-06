package com.wzj.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wzj on 2018/3/14.
 */
@RestController
public class WelcomeController
{
    /**
     * 首页
     * @return 测试
     */
    @RequestMapping(value = "/welcome")
    @ResponseBody
    public String welcome()
    {
        return "Hello World";
    }

    @RequestMapping(value = "/index")
    public ModelAndView index(ModelAndView view)
    {
        //设置jsp名字
        view.setViewName("index");

        //传递数据
        view.addObject("name","张三");

        return view;
    }

    @RequestMapping(value = "/testJsp")
    public ModelAndView testJsp(ModelAndView view)
    {
        //设置jsp名字
        view.setViewName("test_jsp");

        //传递数据
        view.addObject("name","张三");

        return view;
    }
}
