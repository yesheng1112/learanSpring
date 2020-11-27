package com.ys.test;

import org.springframework.util.ClassUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println(ClassUtils.isAssignableValue(I.class, new B()));
    }
}
