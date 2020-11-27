package com.ys.mybatisMapperScan;

import com.ys.mybatisMapperScan.mapper.TestMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(applicationContext.getBean(TestMapper.class));
        System.out.println(applicationContext.getBean(TestMapper.class).selectById(1));
    }
}
