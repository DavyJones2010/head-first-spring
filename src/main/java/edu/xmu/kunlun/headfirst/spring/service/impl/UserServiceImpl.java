package edu.xmu.kunlun.headfirst.spring.service.impl;

import edu.xmu.kunlun.headfirst.spring.aspect.Perf;
import edu.xmu.kunlun.headfirst.spring.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Perf
    @Override
    public String getUser() {
        try {
            Thread.sleep((long) (Math.random() * 1000L));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello world!";
    }
}
