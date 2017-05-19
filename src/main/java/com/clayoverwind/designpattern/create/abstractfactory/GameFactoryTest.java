package com.clayoverwind.designpattern.create.abstractfactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author clayoverwind
 * @version 2017/5/19
 * @E-mail clayanddev@163.com
 */
public class GameFactoryTest {
    @Test
    public void testCreateGameByNameNormal() {
        GameFactory factory = new BlizzardGameFactory();
        Game game = factory.createGame();
        Assert.assertEquals("Game : OverWatch", game.toString());

        factory = new KleiGameFactory();
        game = factory.createGame();
        Assert.assertEquals("Game : DontStarve", game.toString());
    }
}
