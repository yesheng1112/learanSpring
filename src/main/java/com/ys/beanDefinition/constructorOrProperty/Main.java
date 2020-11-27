package com.ys.beanDefinition.constructorOrProperty;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("SpringConstructorOrProperty.xml");
        BeanDefinition aBeanDefinition = xmlApplicationContext.getBeanFactory().getBeanDefinition("a");
        System.out.println("ArgumentCount:" + aBeanDefinition.getConstructorArgumentValues().getArgumentCount());
        System.out.println("PropertyValue:" + aBeanDefinition.getPropertyValues());
    }
}
