package com.clayoverwind.designpattern.structure.bridge;

import org.junit.Test;

/**
 * @author clayoverwind
 * @version 2017/6/1
 * @E-mail clayanddev@163.com
 */
public class BridgeTest {
    @Test
    public void test() {
        HeroBridge bridge = new MyHeroBridge(new Batman());
        bridge.makeHeroToSaveTheWorld();

        bridge = new MyHeroBridge(new Superman());
        bridge.makeHeroToSaveTheWorld();
    }
}
