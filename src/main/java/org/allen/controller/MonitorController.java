package org.allen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("monitor")
public class MonitorController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("ok")
    public String ok() {
        return "ok";
    }

    @RequestMapping("redis")
    public String redis() {
        Set<String> keys = stringRedisTemplate.keys("*");
        return String.valueOf(keys.size());
    }
}
