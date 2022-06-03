package edu.xmu.kunlun.headfirst.spring.annotation;

@MyAnno3
public interface MyInterface {
    @MyAnnoOnMethod
    @MyAnnoOnMethod2
    void callMe();
}
