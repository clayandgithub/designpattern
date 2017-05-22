package com.clayoverwind.designpattern.create.builder;

/**
 * @author clayoverwind
 * @version 2017/5/22
 * @E-mail clayanddev@163.com
 */
public class OrderBuilder {
    public static Order buildPackageA(int count) {
        Order order = new Order();
        order.setDrink("coffee");
        order.setFood("cookie");
        order.setCount(count);
        return order;
    }

    public static Order buildPackageB(int count) {
        Order order = new Order();
        order.setDrink("beer");
        order.setFood("bread");
        order.setCount(count);
        return order;
    }
}