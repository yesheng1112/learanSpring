package com.ys.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext anno = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(anno.getBean(A.class).getB());
    }
}
