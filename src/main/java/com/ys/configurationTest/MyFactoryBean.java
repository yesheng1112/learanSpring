package com.ys.configurationTest;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new C();
    }

    @Override
    public Class<?> getObjectType() {
        return C.class;
    }
}
