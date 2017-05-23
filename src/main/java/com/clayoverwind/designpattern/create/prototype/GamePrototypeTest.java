package com.clayoverwind.designpattern.create.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * @author clayoverwind
 * @version 2017/5/23
 * @E-mail clayanddev@163.com
 */
public class GamePrototypeTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        GamePrototype prototype = new GamePrototype("original");
        GamePrototype cloned = prototype.clone();
        Assert.assertTrue(cloned.getName() == prototype.getName());
    }

    @Test
    public void testDeepClone() throws CloneNotSupportedException, IOException, ClassNotFoundException {
        GamePrototype prototype = new GamePrototype("original");
        GamePrototype cloned = prototype.deepClone();
        Assert.assertFalse(cloned.getName() == prototype.getName());
    }
}
