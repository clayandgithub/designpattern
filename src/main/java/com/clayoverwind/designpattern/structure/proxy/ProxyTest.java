package com.clayoverwind.designpattern.structure.proxy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author clayoverwind
 * @version 2017/5/26
 * @E-mail clayanddev@163.com
 */
public class ProxyTest {

    @Test
    public void testProxy() {
        Player player = new NormalPlayer();
        Assert.assertEquals("NormalPlayer is playing.", player.play());
        player = new Proxy(new NormalPlayer());
        Assert.assertEquals("NormalPlayer is playing. Proxy is playing.", player.play());
    }
}
