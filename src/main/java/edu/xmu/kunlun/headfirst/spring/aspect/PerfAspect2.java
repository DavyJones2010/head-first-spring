package edu.xmu.kunlun.headfirst.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @see <a href="https://www.baeldung.com/spring-aop-annotation">Implementing a Custom Spring AOP Annotation</a>
 */
@Aspect
@Component
public class PerfAspect2 {
    @Around("execution(public * edu.xmu.kunlun.headfirst.spring.service.Filter+.doFilter(..))")
    public Object perf(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName + " start on PerfAspect2");
        Object o = null;
        try {
            o = joinPoint.proceed();
        } finally {
            System.out.println(methodName + " on PerfAspect2" + " finished cost: " + (System.currentTimeMillis() - start));
        }
        return o;
    }

}
