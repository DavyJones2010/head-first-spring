package edu.xmu.kunlun.headfirst.spring.aspect2;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractBeanFactoryPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class PerfAdvisor extends AbstractBeanFactoryPointcutAdvisor {
    private final StaticMethodMatcherPointcut pointcut = new StaticMethodMatcherPointcut() {
        @Override
        public boolean matches(Method method, Class<?> targetClass) {
            // 直接使用spring工具包，来获取method上的注解（会找父类上的注解）
            return AnnotatedElementUtils.hasAnnotation(method, Perf2.class);
        }
    };
    private final Advice advice = new PerfInterceptor();

    @Override
    public Pointcut getPointcut() {
        return pointcut;
    }

    @Override
    public Advice getAdvice() {
        return advice;
    }

}
