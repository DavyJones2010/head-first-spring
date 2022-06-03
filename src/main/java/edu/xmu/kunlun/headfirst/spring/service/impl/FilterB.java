package edu.xmu.kunlun.headfirst.spring.service.impl;

import edu.xmu.kunlun.headfirst.spring.aspect.Perf;
import edu.xmu.kunlun.headfirst.spring.service.Filter;
import org.springframework.stereotype.Component;

@Component
public class FilterB implements Filter {
    @Override
    @Perf
    public void doFilter() {
        System.out.println("FilterB");
    }
}
