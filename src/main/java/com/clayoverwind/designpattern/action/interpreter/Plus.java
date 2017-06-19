package com.clayoverwind.designpattern.action.interpreter;

/**
 * @author clayoverwind
 * @version 2017/6/19
 * @E-mail clayanddev@163.com
 */
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() + context.getNum2();
    }
}
