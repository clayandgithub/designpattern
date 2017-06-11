package com.clayoverwind.designpattern.action.chainofresponsibility;

import org.junit.Test;

/**
 * @author clayoverwind
 * @version 2017/6/11
 * @E-mail clayanddev@163.com
 */
public class ChainTest {

    @Test
    public void test() {
        Reporter reporter = new Reporter();
        Editor editor = new Editor();
        reporter.setHandler(editor);
        reporter.operate();
    }
}
