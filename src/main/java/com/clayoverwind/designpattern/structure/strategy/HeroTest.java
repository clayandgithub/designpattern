package com.clayoverwind.designpattern.structure.strategy;

import org.junit.Test;

/**
 * @author clayoverwind
 * @version 2017/6/2
 * @E-mail clayanddev@163.com
 */
public class HeroTest {

    @Test
    public void test() {
        Hero hero = new Batman();
        hero.saveTheEarth();
        hero = new Superman();
        hero.saveTheEarth();

        AbstractHero hero2 = new Batman();
        hero2.saveTheEarth();
        hero2 = new Superman();
        hero2.saveTheEarth();
    }
}
