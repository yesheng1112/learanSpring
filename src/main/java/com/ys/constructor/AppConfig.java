package com.ys.constructor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.ys.constructor")
@EnableAspectJAutoProxy
public class AppConfig {
}
