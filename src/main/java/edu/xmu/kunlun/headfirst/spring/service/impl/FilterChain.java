package edu.xmu.kunlun.headfirst.spring.service.impl;

import edu.xmu.kunlun.headfirst.spring.service.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FilterChain {

    @Autowired
    List<Filter> filters;

    public void filterAll() {
        filters.stream().forEach(e -> e.doFilter());
    }
}
