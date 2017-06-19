package com.clayoverwind.designpattern.action.interpreter;

import org.junit.Test;

/**
 * @author clayoverwind
 * @version 2017/6/19
 * @E-mail clayanddev@163.com
 */
public class InterpreterTest {

    @Test
    public void test() {
        System.out.println(new Minus().interpret(new Context(new Plus().interpret(new Context(9, 2)), 6)));
    }
}
