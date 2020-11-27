package com.ys.beanDefinition.abstractXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("SpringAbstract.xml");
        System.out.println("template:BeanDefinition:" + xmlApplicationContext.getBeanFactory().getBeanDefinition("template").getClass());
        System.out.println("A:BeanDefinition:" + xmlApplicationContext.getBeanFactory().getBeanDefinition("a").getClass());
        System.out.println("A:name:" + xmlApplicationContext.getBean(A.class).getName());
    }
}
