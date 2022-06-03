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
public class PerfAspect {
    @Around("@annotation(Perf)")
    public Object perf(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName + " start");
        Object o = null;
        try {
            o = joinPoint.proceed();
        } finally {
            System.out.println(methodName + " finished cost: " + (System.currentTimeMillis() - start));
        }
        return o;
    }

}
