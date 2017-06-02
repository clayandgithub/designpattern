package com.clayoverwind.designpattern.structure.composite;

import org.junit.Test;

/**
 * @author clayoverwind
 * @version 2017/6/2
 * @E-mail clayanddev@163.com
 */
public class BlizzardTest {

    @Test
    public void test() {
        Blizzard blizzard = new Blizzard();
        blizzard.addGame(new Diablo());
        blizzard.addGame(new OverWatch());
        blizzard.printGames();
    }
}
