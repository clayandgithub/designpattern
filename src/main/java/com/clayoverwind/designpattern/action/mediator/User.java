package com.clayoverwind.designpattern.action.mediator;

/**
 * @author clayoverwind
 * @version 2017/6/19
 * @E-mail clayanddev@163.com
 */
public abstract class User {
    private Mediator mediator;

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void work();

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
