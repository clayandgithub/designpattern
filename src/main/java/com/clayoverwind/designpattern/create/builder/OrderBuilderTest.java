package com.clayoverwind.designpattern.create.builder;

import org.junit.Test;

/**
 * @author clayoverwind
 * @version 2017/5/22
 * @E-mail clayanddev@163.com
 */
public class OrderBuilderTest {
    @Test
    public void testBuild() {
        Order order1 = new OrderBuilder("hot dog", "coffee", 2).setSpicy(true).build();
        System.out.println(order1);

        Order order2 = new OrderBuilder("beer", "bread", 1).setCooled(true).build();
        System.out.println(order2);
    }
}
