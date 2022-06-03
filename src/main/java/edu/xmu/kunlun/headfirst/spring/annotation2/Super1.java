package edu.xmu.kunlun.headfirst.spring.annotation2;

import edu.xmu.kunlun.headfirst.spring.annotation.MyAnnoOnMethod;

public interface Super1 {
    @MyAnnoOnMethod(ok = false)
    void call();
}
