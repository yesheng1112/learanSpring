package com.ys.configurationTest.cglib;

import net.sf.cglib.proxy.Enhancer;
import org.junit.jupiter.api.Test;

public class CglibTest1 {
    @Test
    public void testCglib() {
        DaoProxy daoProxy = new DaoProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Dao1.class);
        enhancer.setCallback(daoProxy);
        Dao1 dao = (Dao1) enhancer.create();
        dao.update();
        dao.select();
    }
}