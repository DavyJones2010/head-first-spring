package edu.xmu.kunlun.headfirst.spring.annotation;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnnotationTest {
    @Test
    void testAnnotationOnType() {
        for (Annotation declaredAnnotation : Super.class.getAnnotations()) {
//            @edu.xmu.kunlun.headfirst.spring.annotation.MyAnno()
//@edu.xmu.kunlun.headfirst.spring.annotation.MyAnno2()
            System.out.println(declaredAnnotation);
        }
        for (Annotation annotation : MyInterface.class.getAnnotations()) {
//            @edu.xmu.kunlun.headfirst.spring.annotation.MyAnno3()
            System.out.println(annotation);
        }

        for (Annotation declaredAnnotation : Sub.class.getAnnotations()) {
//            @edu.xmu.kunlun.headfirst.spring.annotation.MyAnno2()
//            只继承了作用在类上, 且被标记为@Inherited 的annotation
            System.out.println(declaredAnnotation);
        }
    }

    @Test
    void testAnnotationOnMethod() throws NoSuchMethodException {
        Method callMeMethod = MyInterface.class.getMethod("callMe");
        for (Annotation annotation : callMeMethod.getAnnotations()) {
//            @edu.xmu.kunlun.headfirst.spring.annotation.MyAnnoOnMethod()
//@edu.xmu.kunlun.headfirst.spring.annotation.MyAnnoOnMethod2()
            System.out.println(annotation);
        }

        Method callMe = Sub.class.getMethod("callMe");
        // 没有被继承下来
        assertTrue(callMe.getAnnotations().length == 0);
    }
}
