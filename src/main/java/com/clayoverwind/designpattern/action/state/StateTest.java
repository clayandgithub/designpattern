package com.clayoverwind.designpattern.action.state;

import org.junit.Test;

/**
 * @author clayoverwind
 * @version 2017/6/14
 * @E-mail clayanddev@163.com
 */
public class StateTest {
    @Test
    public void test() {
        Context context = new Context();
        context.setCurrentState(new StateA());
        context.handle();
        context.setCurrentState(new StateB());
        context.handle();
    }
}
