package com.ys.mergeBeanDefinition;

import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        RootBeanDefinition rootBean = new RootBeanDefinition();
        rootBean.setBeanClass(RootBean.class);
        rootBean.getPropertyValues().add("name","张三");
        rootBean.getPropertyValues().add("age","18");
        context.registerBeanDefinition("root", rootBean);

        GenericBeanDefinition childBean = new GenericBeanDefinition();
        childBean.setBeanClass(ChildBean.class);
        childBean.getPropertyValues().add("name", "李四");
        childBean.setParentName("root");
        context.registerBeanDefinition("child", childBean);
        context.refresh();

        System.out.println(context.getBean(ChildBean.class));

    }
}
