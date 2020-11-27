package com.ys.threeBeanPostProcessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class A {

    @Resource
    public B b1;

    @Autowired
    public B b2;

    public B b3;

    public void setB3(B b3) {
        this.b3 = b3;
    }

    public void setBx(B b){
       this.b3 = new B("a");
    }
}
