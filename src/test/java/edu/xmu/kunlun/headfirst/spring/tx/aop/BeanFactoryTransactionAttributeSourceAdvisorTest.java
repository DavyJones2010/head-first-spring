package edu.xmu.kunlun.headfirst.spring.tx.aop;

import edu.xmu.kunlun.headfirst.spring.tx.TransApi;
import edu.xmu.kunlun.headfirst.spring.tx.TransApiImpl;
import org.junit.jupiter.api.Test;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.BeanFactoryTransactionAttributeSourceAdvisor;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BeanFactoryTransactionAttributeSourceAdvisorTest {

    @Test
    void matchesTest() throws NoSuchMethodException {
        BeanFactoryTransactionAttributeSourceAdvisor advisor = new BeanFactoryTransactionAttributeSourceAdvisor();
        StaticMethodMatcherPointcut pointcut = (StaticMethodMatcherPointcut) advisor.getPointcut();

        Method update = TransApi.class.getMethod("update", new Class[]{int.class});
        boolean matches = pointcut.matches(update, Transactional.class);
        assertTrue(matches);

        // 注意: 这里子类上, 也匹配到了 @Transactional annotation了.
        // 注意与: edu.xmu.kunlun.headfirst.spring.annotation.AnnotationTest.testAnnotationOnMethod 的区别
        update =  TransApiImpl.class.getMethod("update", new Class[]{int.class});
        matches = pointcut.matches(update, Transactional.class);
        assertTrue(matches);
    }
}
