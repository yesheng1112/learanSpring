package com.ys.threeBeanPostProcessor.config;

import com.ys.threeBeanPostProcessor.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ys.threeBeanPostProcessor")
public class AppConfig {

    @Bean
    public B b(){
        return new B("AppConfig");
    }
}
