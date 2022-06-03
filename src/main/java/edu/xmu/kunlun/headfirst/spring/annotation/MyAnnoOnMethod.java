package edu.xmu.kunlun.headfirst.spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 1. 作用在方法
 * 2. 不能被继承, 即未打 @Inherited 标签
 * --> 最终效果是: 实际不能被继承的
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnoOnMethod {
}
