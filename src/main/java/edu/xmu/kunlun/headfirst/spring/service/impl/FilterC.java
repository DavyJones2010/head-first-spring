package edu.xmu.kunlun.headfirst.spring.service.impl;

import edu.xmu.kunlun.headfirst.spring.service.Filter;
import org.springframework.stereotype.Component;

@Component
public class FilterC implements Filter {
    @Override
//    @Perf
    public void doFilter() {
        System.out.println("FilterC");
    }
}
