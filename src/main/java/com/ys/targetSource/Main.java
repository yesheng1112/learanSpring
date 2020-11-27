package com.ys.targetSource;

import org.springframework.aop.TargetSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("springTargetSource.xml");
        TargetSource targetSource = (TargetSource) xmlApplicationContext.getBean("targetSource");
        for (int i = 0; i < 10; i++) {
            Apple apple = (Apple) targetSource.getTarget();
            apple.eat();
        }

    }
}
