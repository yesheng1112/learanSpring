package com.ys.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext xml = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(xml.getBean(A.class).getI());
    }
}
