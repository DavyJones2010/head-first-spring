package edu.xmu.kunlun.headfirst.spring.service;

import edu.xmu.kunlun.headfirst.spring.aspect.Perf;

public interface Filter {
    @Perf
    void doFilter();
}

