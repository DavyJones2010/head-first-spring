package edu.xmu.kunlun.headfirst.spring.aspect2;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerfInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        long start = System.currentTimeMillis();
        String className = invocation.getThis().getClass().getName();
        String methodName = invocation.getMethod().getName();
        System.out.println(className + "." + methodName + " start on PerfInterceptor");
        Object o = null;
        try {
            o = invocation.proceed();
        } finally {
            System.out.println(className + "." + methodName + " on PerfInterceptor" + " finished cost: " + (System.currentTimeMillis() - start));
        }
        return o;
    }

}
