package com.clayoverwind.designpattern.action.mediator;

import org.junit.Test;

/**
 * @author clayoverwind
 * @version 2017/6/19
 * @E-mail clayanddev@163.com
 */
public class MediatorTest {
    @Test
    public void test() {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
