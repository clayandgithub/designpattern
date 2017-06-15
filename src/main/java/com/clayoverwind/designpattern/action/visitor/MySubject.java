package com.clayoverwind.designpattern.action.visitor;

/**
 * @author clayoverwind
 * @version 2017/6/15
 * @E-mail clayanddev@163.com
 */
public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}
