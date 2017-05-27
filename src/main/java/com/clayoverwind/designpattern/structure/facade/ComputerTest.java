package com.clayoverwind.designpattern.structure.facade;

import org.junit.Test;

/**
 * @author clayoverwind
 * @version 2017/5/27
 * @E-mail clayanddev@163.com
 */
public class ComputerTest {

    @Test
    public void testFacade() {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
