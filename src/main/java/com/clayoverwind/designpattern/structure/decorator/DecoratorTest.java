package com.clayoverwind.designpattern.structure.decorator;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author clayoverwind
 * @version 2017/5/25
 * @E-mail clayanddev@163.com
 */
public class DecoratorTest {

    @Test
    public void test() {
        Hero hero = new Batman();
        Assert.assertEquals("Batman is saving the earth.", hero.saveTheEarth());
        hero = new BatmanWithBatmobile();
        Assert.assertEquals("Batman is in Batmobile.Batman is saving the earth.", hero.saveTheEarth());
    }
}
