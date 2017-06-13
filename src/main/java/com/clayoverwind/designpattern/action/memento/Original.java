package com.clayoverwind.designpattern.action.memento;

/**
 * @author clayoverwind
 * @version 2017/6/13
 * @E-mail clayanddev@163.com
 */
public class Original {
    private String value;

    public Original(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setValue(value);
        return memento;
    }

    public void restoreFromMemento(Memento memento) {
        this.value = memento.getValue();
    }
}
