package com.clayoverwind.designpattern.structure.bridge;

/**
 * @author clayoverwind
 * @version 2017/6/1
 * @E-mail clayanddev@163.com
 */
public class Batman implements Hero {
    @Override
    public void saveTheWord() {
        System.out.println("Batman is saving the world.");
    }
}
