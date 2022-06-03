package edu.xmu.kunlun.headfirst.spring.annotation2;

import edu.xmu.kunlun.headfirst.spring.annotation.MyAnnoOnMethod;

public interface Super2 {
    @MyAnnoOnMethod(ok = true)
    void call();
}
