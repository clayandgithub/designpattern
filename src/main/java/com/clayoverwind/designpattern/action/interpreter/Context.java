package com.clayoverwind.designpattern.action.interpreter;

/**
 * @author clayoverwind
 * @version 2017/6/19
 * @E-mail clayanddev@163.com
 */
public class Context {
    private int num1;

    private int num2;

    public Context(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
}