package com.ys.beanLife.bean;

import org.springframework.stereotype.Component;

@Component
public class A{

    public A() {
        System.out.println("A init");
    }

    public A(B b) {
        System.out.println("A b init");
    }

    public A(C c) {
        System.out.println("A c init");
    }
}
