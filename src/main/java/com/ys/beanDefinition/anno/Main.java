package com.ys.beanDefinition.anno;

import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        AnnotatedGenericBeanDefinition annotatedBeanDefinition = (AnnotatedGenericBeanDefinition) applicationContext.getBeanDefinition("appConfig");
        ScannedGenericBeanDefinition scannedGenericBeanDefinition = (ScannedGenericBeanDefinition) applicationContext.getBeanDefinition("b");
        System.out.println(annotatedBeanDefinition);
        System.out.println(scannedGenericBeanDefinition);
    }
}
