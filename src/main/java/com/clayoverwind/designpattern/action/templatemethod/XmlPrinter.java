package com.clayoverwind.designpattern.action.templatemethod;

/**
 * @author clayoverwind
 * @version 2017/6/6
 * @E-mail clayanddev@163.com
 */
public class XmlPrinter extends Printer {
    @Override
    protected void startup() {
        System.out.println("XmlPrinter.startup");
    }

    @Override
    protected void loadDriver() {
        System.out.println("XmlPrinter.loadDriver");
    }

    @Override
    protected void printContent(String content) {
        System.out.println("XmlPrinter.printContent");
    }

    @Override
    protected void shutdown() {
        System.out.println("XmlPrinter.shutdown");
    }
}
