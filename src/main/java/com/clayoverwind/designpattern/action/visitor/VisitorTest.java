package com.clayoverwind.designpattern.action.visitor;

import org.junit.Test;

/**
 * @author clayoverwind
 * @version 2017/6/15
 * @E-mail clayanddev@163.com
 */
public class VisitorTest {
    @Test
    public void test() {
        Subject mySubject = new MySubject();
        Visitor myVisitor = new MyVisitor();
        mySubject.accept(myVisitor);
    }
}
