package edu.xmu.kunlun.headfirst.spring.service.impl;

import edu.xmu.kunlun.headfirst.spring.aspect.Perf;
import org.springframework.stereotype.Component;

@Component
public class UserSvc {

    @Perf
    public void start() {
        // 注意, doSmt 虽然有 @Perf annotation,
        // 但实际由于是在被代理对象内部调用, 因此该annotation不会生效.
        doSmt();
    }

    @Perf
    public void doSmt() {
        System.out.println("doSmt");
    }

}
