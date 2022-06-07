package edu.xmu.kunlun.headfirst.spring.aspect2;

import edu.xmu.kunlun.headfirst.spring.service.impl.FilterChain;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Perf2Test {
    @Autowired
    FilterChain chain;

    @Test
    void name() {
        chain.filterAll();;
    }
}
