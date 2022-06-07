package edu.xmu.kunlun.headfirst.spring.service;

import edu.xmu.kunlun.headfirst.spring.aspect.Perf;
import edu.xmu.kunlun.headfirst.spring.aspect2.Perf2;

public interface Filter {
    @Perf
    @Perf2
    void doFilter();
}

