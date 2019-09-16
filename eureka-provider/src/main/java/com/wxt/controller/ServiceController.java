package com.wxt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Auther: ThomasWu
 * @Date: 2019/9/16 22:11
 * @Email:1414924381@qq.com
 */
@RestController
public class ServiceController {

    @RequestMapping(value = "/find")
    public String hello(@RequestParam String name) {
        return "find " + name;
    }
}
