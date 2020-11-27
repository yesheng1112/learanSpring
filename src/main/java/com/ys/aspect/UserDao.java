package com.ys.aspect;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

    public void testAop() {
        System.out.println("UserDao.testAop");
    }
}
