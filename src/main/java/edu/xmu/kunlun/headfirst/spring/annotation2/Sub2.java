package edu.xmu.kunlun.headfirst.spring.annotation2;

public class Sub2 implements Super1, Super2 {
    @Override
    public void call() {
        System.out.println("i am ok");
    }
}
