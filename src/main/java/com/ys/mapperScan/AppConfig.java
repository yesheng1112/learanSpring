package com.ys.mapperScan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ys.mapperScan")
@MapperScan("com.ys.mapperScan.inte")
public class AppConfig {
}
