package com.ys.beanLife;

import com.ys.beanLife.bean.B;
import com.ys.beanLife.bean.I;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

//@Component
public class ABeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        GenericBeanDefinition a = (GenericBeanDefinition) beanFactory.getBeanDefinition("a");
        ConstructorArgumentValues values = new ConstructorArgumentValues();
        I i = new B();
        ConstructorArgumentValues.ValueHolder valueHolder = new ConstructorArgumentValues.ValueHolder(i,"com.ys.beanLife.bean.B","b");
        values.addGenericArgumentValue(valueHolder);
        a.setConstructorArgumentValues(values);
        a.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);
    }
}
