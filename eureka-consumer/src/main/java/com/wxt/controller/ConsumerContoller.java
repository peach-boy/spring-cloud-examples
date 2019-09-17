package com.wxt.controller;

import com.wxt.api.ServiceClient;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Auther: ThomasWu
 * @Date: 2019/9/16 22:14
 * @Email:1414924381@qq.com
 */
@RestController
public class ConsumerContoller {

    @Autowired
    private ServiceClient serviceClient;

    @ApiOperation(value = "query")
    @GetMapping(value = "/queryByName")
    public String consummer(@RequestParam String name) {
        return serviceClient.findByName(name);
    }
}
