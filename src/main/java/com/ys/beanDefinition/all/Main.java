package com.ys.beanDefinition.all;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.ChildBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //模板BeanDefinition
        /*RootBeanDefinition templateBeanDefinition = new RootBeanDefinition();
        Map<String, String> map = new HashMap<>();
        map.put("name", "king");
        templateBeanDefinition.setPropertyValues(new MutablePropertyValues(map));
        templateBeanDefinition.setAbstract(true);

        ChildBeanDefinition aChildBeanDefinition = new ChildBeanDefinition("template");
        aChildBeanDefinition.setBeanClass(A.class);

        ChildBeanDefinition bChildBeanDefinition = new ChildBeanDefinition("template");
        bChildBeanDefinition.setBeanClass(B.class);*/

        GenericBeanDefinition templateBeanDefinition = new GenericBeanDefinition();
        Map<String, String> map = new HashMap<>();
        map.put("name", "king");
        templateBeanDefinition.setPropertyValues(new MutablePropertyValues(map));
        templateBeanDefinition.setAbstract(true);

        GenericBeanDefinition aChildBeanDefinition = new GenericBeanDefinition();
        aChildBeanDefinition.setParentName("template");
        aChildBeanDefinition.setBeanClass(A.class);

        GenericBeanDefinition bChildBeanDefinition = new GenericBeanDefinition();
        bChildBeanDefinition.setParentName("template");
        bChildBeanDefinition.setBeanClass(B.class);

        context.registerBeanDefinition("template", templateBeanDefinition);
        context.registerBeanDefinition("a", aChildBeanDefinition);
        context.registerBeanDefinition("b", bChildBeanDefinition);
        context.refresh();


        System.out.println("A:name:" + context.getBean(A.class).getName());
        System.out.println("B:name:" + context.getBean(B.class).getName());
    }
}
