package com.clayoverwind.designpattern.structure.flyweight;

import com.clayoverwind.designpattern.structure.composite.Blizzard;
import com.clayoverwind.designpattern.structure.composite.Diablo;
import com.clayoverwind.designpattern.structure.composite.OverWatch;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author clayoverwind
 * @version 2017/6/2
 * @E-mail clayanddev@163.com
 */
public class HeroFactoryTest {

    @Test
    public void test() {
        Hero batman = HeroFactory.getHeroByName("batman");
        Hero superman = HeroFactory.getHeroByName("superman");
        Hero batman2 = HeroFactory.getHeroByName("batman");
        Hero batman3 = new Hero("batman");

        Assert.assertNotEquals(batman, superman);
        Assert.assertEquals(batman, batman2);
        Assert.assertNotEquals(batman, batman3);
    }
}
