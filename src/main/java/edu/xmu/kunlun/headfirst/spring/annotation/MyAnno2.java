package edu.xmu.kunlun.headfirst.spring.annotation;

import java.lang.annotation.*;

/**
 * 1. 作用在类上
 * 2. 可以被继承
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnno2 {
}
