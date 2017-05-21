package com.clayoverwind.designpattern.create.singleton;

/**
 * @author clayoverwind
 * @version 2017/5/21
 * @E-mail clayanddev@163.com
 */
public class Singleton5 {
    public synchronized static Singleton5 getInstance() {
        return new Singleton5();
    }
}
