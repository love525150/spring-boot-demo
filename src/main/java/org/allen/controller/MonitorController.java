package org.allen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        ValueOperations<String, String> operations = stringRedisTemplate.opsForValue();
        return operations.get("key");
    }
}
