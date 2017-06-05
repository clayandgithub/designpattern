package com.clayoverwind.designpattern.structure.strategy;

/**
 * @author clayoverwind
 * @version 2017/6/5
 * @E-mail clayanddev@163.com
 */
public abstract class AbstractHero implements Hero {

    @Override
    public void saveTheEarth() {
        System.out.println("AbstractHero is saving the earth.");
    }
}
