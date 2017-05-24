package com.clayoverwind.designpattern.structure.adapter;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author clayoverwind
 * @version 2017/5/24
 * @E-mail clayanddev@163.com
 */
public class BatmanTest {

    @Test
    public void testAdapter() {
        Hero hero = new Batman();
        Assert.assertEquals(hero.eat(), "eat");
        Assert.assertEquals(hero.sleep(), "sleep");
        Assert.assertEquals(hero.saveTheEarth(), "saveTheEarth");
    }
}
