package com.clayoverwind.designpattern.create.singleton;

/**
 * @author clayoverwind
 * @version 2017/5/21
 * @E-mail clayanddev@163.com
 */
public class Singleton3 {
    private volatile static Singleton3 INSTANCE;

    private Singleton3(){}

    private Singleton3 getInstance() {
        if (INSTANCE == null) {
            synchronized (INSTANCE) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton3();
                }
            }
        }
        return INSTANCE;
    }
}
