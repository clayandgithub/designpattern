package com.clayoverwind.designpattern.action.memento;

import org.junit.Test;

/**
 * @author clayoverwind
 * @version 2017/6/13
 * @E-mail clayanddev@163.com
 */
public class MementoTest {

    @Test
    public void test() {
        Original original = new Original("Hello");
        Storage storage = new Storage(original.createMemento());

        System.out.println("初始化状态为：" + original.getValue());
        original.setValue("World");
        System.out.println("修改后的状态为：" + original.getValue());

        original.restoreFromMemento(storage.getMemento());
        System.out.println("恢复后的状态为：" + original.getValue());


    }
}
