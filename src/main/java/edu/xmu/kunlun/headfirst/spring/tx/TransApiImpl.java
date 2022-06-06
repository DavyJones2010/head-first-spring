package edu.xmu.kunlun.headfirst.spring.tx;

import org.springframework.stereotype.Service;

@Service
public class TransApiImpl implements TransApi {
    @Override
    public boolean update(int id) {
        throw new RuntimeException("error");
    }
}
