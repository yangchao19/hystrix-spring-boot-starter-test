package com.yang.middleware.test.interfaces;

import com.yang.middleware.hystrix.annotation.DoHystrix;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author：杨超
 * @date: 2023/7/12
 * @Copyright：
 */
@RestController
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @DoHystrix(timeoutValue = 500, returnJson = "{\"code\":\"1111\",\"info\":\"调用方法超过350毫秒，熔断返回！\"}")
    @RequestMapping(path = "/api/queryUserInfo", method = RequestMethod.GET)
    public UserInfo queryUserInfo(@RequestParam String userId) throws InterruptedException {
        Thread.sleep(350);
        return new UserInfo("婷婷:" + userId ,18, "广东广州番禺区");
    }
}
