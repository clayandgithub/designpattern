package com.clayoverwind.designpattern.create.singleton;

/**
 * @author clayoverwind
 * @version 2017/5/21
 * @E-mail clayanddev@163.com
 */
public class Singleton4 {

    private static class InstanceClass {
        public static Singleton4 INSTANCE = new Singleton4();
    }

    private Singleton4 getInstance() {
        return InstanceClass.INSTANCE;
    }
}
