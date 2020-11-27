package com.ys.circularDependencies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

    @Autowired
    private A a;

    public B() {
        System.out.println("B init");
    }
}
