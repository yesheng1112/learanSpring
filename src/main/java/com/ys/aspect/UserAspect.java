package com.ys.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class UserAspect {

    @Pointcut("execution(* com.ys.aspect.UserDao.*(..))")
    public void pointCut(){

    }

    @Around("pointCut()")
    public Object beforeAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before");
        return joinPoint.proceed();
    }
}
