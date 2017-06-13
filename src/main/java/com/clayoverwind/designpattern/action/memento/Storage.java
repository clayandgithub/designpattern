package com.clayoverwind.designpattern.action.memento;

/**
 * @author clayoverwind
 * @version 2017/6/13
 * @E-mail clayanddev@163.com
 */
public class Storage {
    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
