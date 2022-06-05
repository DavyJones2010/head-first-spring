package edu.xmu.kunlun.headfirst.spring.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ClassUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserSvcTest {
    @Autowired
    UserSvc userSvc;

    @Test
    void name() {
        String proxyClassName = userSvc.getClass().getName();
        // 如下: 从Spring容器里获取的是代理类
        assertTrue(proxyClassName.startsWith("edu.xmu.kunlun.headfirst.spring.service.impl.UserSvc$$EnhancerBySpringCGLIB$$"));

        String className = ClassUtils.getUserClass(userSvc).getName();
        // 如下: 可以获取到被代理类
        assertEquals("edu.xmu.kunlun.headfirst.spring.service.impl.UserSvc", className);

        // 如下方式调用: doSmt 会被 @Perf 拦截
        userSvc.doSmt();

        // 如下方式调用: doSmt 不会被 @Perf 拦截
        userSvc.start();
    }
}
