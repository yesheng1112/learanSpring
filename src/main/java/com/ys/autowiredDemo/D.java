package com.ys.autowiredDemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ObjectFactory;

public class D implements ObjectFactory {
    @Override
    public Object getObject() throws BeansException {
        return new E();
    }
}
