package com.example.SpringBoot_Test.Controller;

import com.example.SpringBoot_Test.Utils.RedisCache;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description：TODO
 * @Author： 30218
 * @Data： 2024/4/1 13:58
 */

@RestController("user")
public class loginController {
    private static final Logger logger = LogManager.getLogger(loginController.class);

    @Autowired
    private RedisCache redisCache;



    @PostMapping("login")
    public void login(){
        System.out.println("login");
        redisCache.setCacheObject("login:", "test");
        logger.error("Error message");
    }

}
