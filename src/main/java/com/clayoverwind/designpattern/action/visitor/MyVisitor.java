package com.clayoverwind.designpattern.action.visitor;

/**
 * @author clayoverwind
 * @version 2017/6/15
 * @E-mail clayanddev@163.com
 */
public class MyVisitor implements Visitor {
    @Override
    public void visit(Subject subject) {
        System.out.println("visit the subject: " + subject.getSubject());
    }
}
