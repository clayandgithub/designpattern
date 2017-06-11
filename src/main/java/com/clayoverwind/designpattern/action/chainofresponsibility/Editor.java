package com.clayoverwind.designpattern.action.chainofresponsibility;

/**
 * @author clayoverwind
 * @version 2017/6/11
 * @E-mail clayanddev@163.com
 */
public class Editor extends AbstractHandler implements Handler {
    @Override
    public void operate() {
        System.out.println("Editor is operating.");
        if(getHandler() != null){
            getHandler().operate();
        }
    }
}
