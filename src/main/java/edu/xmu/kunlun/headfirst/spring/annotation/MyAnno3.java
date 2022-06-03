package edu.xmu.kunlun.headfirst.spring.annotation;

import java.lang.annotation.*;

/**
 * 1. 作用在接口上
 * 2. 可以被继承
 * --> 最终实际不能被继承
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnno3 {
}
