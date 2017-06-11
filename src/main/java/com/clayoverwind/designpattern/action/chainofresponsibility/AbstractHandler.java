package com.clayoverwind.designpattern.action.chainofresponsibility;

/**
 * @author clayoverwind
 * @version 2017/6/11
 * @E-mail clayanddev@163.com
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
