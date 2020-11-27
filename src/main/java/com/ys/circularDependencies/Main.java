package com.ys.circularDependencies;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(AppConfig.class);
        //applicationContext.setAllowCircularReferences(false);
        applicationContext.refresh();
        System.out.println(applicationContext.getBean(A.class));
    }
}
