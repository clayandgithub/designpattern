package com.clayoverwind.designpattern.action.visitor;

/**
 * @author clayoverwind
 * @version 2017/6/15
 * @E-mail clayanddev@163.com
 */
public interface Subject {

    void accept(Visitor visitor);

    String getSubject();
}
