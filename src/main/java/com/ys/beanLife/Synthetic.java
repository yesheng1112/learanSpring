package com.ys.beanLife;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Synthetic {

    public void test() {
        SyntheticInner inner = new SyntheticInner();
        System.out.println(inner.s);
    }

    private class SyntheticInner {
        private SyntheticInner() {

        }

        private String s = "";
    }

    public static void main(String[] args) throws NoSuchMethodException {
        for (Method declaredMethod : Synthetic.class.getDeclaredMethods()) {
            System.out.println(Synthetic.class.getSimpleName() + ":" + declaredMethod.getName() + ":" + declaredMethod.isSynthetic());
        }
        for (Method declaredMethod : SyntheticInner.class.getDeclaredMethods()) {
            System.out.println(SyntheticInner.class.getSimpleName() + ":" + declaredMethod.getName() + ":" + declaredMethod.isSynthetic());
        }
        for (Constructor<?> declaredConstructor : SyntheticInner.class.getDeclaredConstructors()) {
            System.out.println(SyntheticInner.class.getSimpleName() + ":" + declaredConstructor.getName() + ":" + declaredConstructor.isSynthetic());
        }
    }
}
