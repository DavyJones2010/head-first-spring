package edu.xmu.kunlun.headfirst.spring.annotation;

import java.lang.annotation.*;

/**
 * 1. 作用在方法上
 * 2. 可以被继承, 即打了 @Inherited 标签
 * --> 最终效果是: 实际不能被继承的
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnnoOnMethod2 {
}
