package com.clayoverwind.designpattern.action.templatemethod;

/**
 * @author clayoverwind
 * @version 2017/6/6
 * @E-mail clayanddev@163.com
 */
public abstract class Printer {
    public void print(String content) {
        startup();
        loadDriver();
        printContent(content);
        shutdown();
    }

    protected abstract void startup();

    protected abstract void loadDriver();

    protected abstract void printContent(String content);

    protected abstract void shutdown();
}
