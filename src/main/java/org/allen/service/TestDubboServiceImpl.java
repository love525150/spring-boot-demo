package org.allen.service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by zzw on 2017/12/4.
 */
@Service(version = "1.0.0")
public class TestDubboServiceImpl implements TestDubboService{

    public String testDubbo() {
        return "dubbo success";
    }
}
