package com.ys.beanDefinition.constructorOrProperty;

public class A {
    private String name;
    private String age;

    public A() {
    }

    public A(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
