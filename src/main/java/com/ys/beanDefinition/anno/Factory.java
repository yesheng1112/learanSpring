package com.ys.beanDefinition.anno;

public class Factory {
    public C createC() {
        return new C();
    }

    public String createProduct() {
        return null;
    }
}
