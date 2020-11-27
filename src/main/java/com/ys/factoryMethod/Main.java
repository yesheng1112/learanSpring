package com.ys.factoryMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringFactoryMethod.xml");
        System.out.println(applicationContext.getBean(Product.class).getName());
    }
}
