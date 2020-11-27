package com.ys.beanDefinition.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ys.beanDefinition.anno")
public class AppConfig {

    @Bean
    public A a(){
        return new A();
    }

}
