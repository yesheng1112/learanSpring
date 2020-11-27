package com.ys.beanDefinition.factoryBeanOrFactoryMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext xml = new ClassPathXmlApplicationContext("SpringFactoryBean.xml");
		System.out.println(xml.getBean(ClientService.class));
	}
}

