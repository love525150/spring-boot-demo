package org.allen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("monitor")
public class MonitorController {

    @RequestMapping("ok")
    public String ok() {
        return "ok";
    }
}
