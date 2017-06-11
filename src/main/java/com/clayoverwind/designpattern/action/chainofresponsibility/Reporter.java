package com.clayoverwind.designpattern.action.chainofresponsibility;

/**
 * @author clayoverwind
 * @version 2017/6/11
 * @E-mail clayanddev@163.com
 */
public class Reporter extends AbstractHandler implements Handler {
    @Override
    public void operate() {
        System.out.println("Reporter is operating.");
        if(getHandler() != null){
            getHandler().operate();
        }
    }
}
