package com.ys.beanLife;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(* com.ys.beanLife.bean.*.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void beforeAdvice() {
        System.out.println("MyAspect.beforeAdvice");
    }
}
