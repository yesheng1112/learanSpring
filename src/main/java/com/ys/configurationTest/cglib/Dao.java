package com.ys.configurationTest.cglib;

public class Dao {

    public Dao() {
        update();
    }

    public void select() {
        System.out.println("Dao.select");
    }

    public void update() {
        System.out.println("Dao.update");
    }
}
