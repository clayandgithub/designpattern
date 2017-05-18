package com.clayoverwind.designpattern.create.simplefactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author clayoverwind
 * @version 2017/5/18
 * @E-mail clayanddev@163.com
 */
public class BlizzardGameFactoryTest {

    @Test
    public void testCreateGameByNameNormal() {
        BlizzardGameFactory factory = new BlizzardGameFactory();
        Game game = factory.createGameByName("OverWatch");
        Assert.assertEquals("Game : OverWatch", game.toString());
        game = factory.createGameByName("Diablo");
        Assert.assertEquals("Game : Diablo", game.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateGameByNameThrowException() {
        BlizzardGameFactory factory = new BlizzardGameFactory();
        Game game = factory.createGameByName("DontStarve");
    }
}
