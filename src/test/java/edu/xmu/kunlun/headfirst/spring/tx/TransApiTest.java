package edu.xmu.kunlun.headfirst.spring.tx;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TransApiTest {
    @Autowired
    TransApi transApi;

    @Test
    void updateTest() {
        transApi.update(1);
    }
}
