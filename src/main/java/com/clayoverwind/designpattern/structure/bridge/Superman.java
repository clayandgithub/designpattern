package com.clayoverwind.designpattern.structure.bridge;

/**
 * @author clayoverwind
 * @version 2017/6/1
 * @E-mail clayanddev@163.com
 */
public class Superman implements Hero {
    @Override
    public void saveTheWord() {
        System.out.println("Superman is saving the world.");
    }
}
