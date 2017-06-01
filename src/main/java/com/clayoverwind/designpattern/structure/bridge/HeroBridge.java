package com.clayoverwind.designpattern.structure.bridge;

/**
 * @author clayoverwind
 * @version 2017/6/1
 * @E-mail clayanddev@163.com
 */
public abstract class HeroBridge {
    protected Hero hero;

    public HeroBridge(Hero hero) {
        this.hero = hero;
    }

    public abstract void makeHeroToSaveTheWorld();
}
