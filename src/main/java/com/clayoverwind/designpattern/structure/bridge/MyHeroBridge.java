package com.clayoverwind.designpattern.structure.bridge;

/**
 * @author clayoverwind
 * @version 2017/6/1
 * @E-mail clayanddev@163.com
 */
public class MyHeroBridge extends HeroBridge {

    public MyHeroBridge(Hero hero) {
        super(hero);
    }

    @Override
    public void makeHeroToSaveTheWorld() {
        this.hero.saveTheWord();
    }
}
