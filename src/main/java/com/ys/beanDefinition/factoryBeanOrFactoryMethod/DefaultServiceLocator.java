package com.ys.beanDefinition.factoryBeanOrFactoryMethod;

public class DefaultServiceLocator {

    private static ClientService clientService = new ClientServiceImpl();

    public ClientService createClientServiceInstance() {
        return clientService;
    }

    public ClientService createClientServiceInstance(String name) {
        return clientService;
    }
}
