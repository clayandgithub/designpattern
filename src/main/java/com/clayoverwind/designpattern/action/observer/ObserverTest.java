package com.clayoverwind.designpattern.action.observer;

import org.junit.Test;

/**
 * @author clayoverwind
 * @version 2017/6/7
 * @E-mail clayanddev@163.com
 */
public class ObserverTest {

    @Test
    public void test() {
        Writer writer = new NormalWriter();
        writer.addReader(new NormalReader());
        writer.addReader(new NormalReader());
        writer.addReader(new NormalReader());
        writer.writeArticle();
    }
}
