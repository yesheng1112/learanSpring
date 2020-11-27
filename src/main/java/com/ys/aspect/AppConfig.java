package com.ys.aspect;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.ys.aspect")
@EnableAspectJAutoProxy
public class AppConfig {
}
