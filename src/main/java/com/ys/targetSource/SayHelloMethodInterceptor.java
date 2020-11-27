package com.ys.targetSource;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class SayHelloMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("方法执行前");
        Object proceed = methodInvocation.proceed();
        System.out.println("方法执行后");
        return proceed;
    }
}