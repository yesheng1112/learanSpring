package com.ys.beanLife;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.ys.beanLife")
@EnableAspectJAutoProxy
public class AppConfig {
}
