package com.wxt.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: TODO
 * @Auther: ThomasWu
 * @Date: 2019/9/16 22:23
 * @Email:1414924381@qq.com
 */
@FeignClient(name = "eureka-provider")
public interface ServiceClient {
    @RequestMapping(value = "/find")
    public String findByName( String name);
}
