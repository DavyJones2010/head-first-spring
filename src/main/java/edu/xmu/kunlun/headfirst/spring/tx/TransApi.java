package edu.xmu.kunlun.headfirst.spring.tx;

import org.springframework.transaction.annotation.Transactional;

public interface TransApi {
    @Transactional(rollbackFor = Exception.class)
    boolean update(int id);
}
