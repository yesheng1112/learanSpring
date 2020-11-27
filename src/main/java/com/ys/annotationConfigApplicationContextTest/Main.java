package com.ys.annotationConfigApplicationContextTest;

import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        AnnotatedGenericBeanDefinition appConfig = (AnnotatedGenericBeanDefinition) context.getBeanFactory().getBeanDefinition("appConfig");
        //appConfig.setAttribute("org.springframework.context.annotation.ConfigurationClassPostProcessor.configurationClass", true);
        context.refresh();
        context.getBean(A.class);
    }
}
