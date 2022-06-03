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

        System.out.println("Start");
        Object o = null;
        try {
            o = joinPoint.proceed();
        } finally {
            System.out.println("Finished cost: " + (System.currentTimeMillis() - start));
        }
        return o;
    }

}
