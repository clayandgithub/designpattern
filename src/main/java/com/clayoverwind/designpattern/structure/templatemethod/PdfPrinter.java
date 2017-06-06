package com.clayoverwind.designpattern.structure.templatemethod;

/**
 * @author clayoverwind
 * @version 2017/6/6
 * @E-mail clayanddev@163.com
 */
public class PdfPrinter extends Printer {
    @Override
    protected void startup() {
        System.out.println("PdfPrinter.startup");
    }

    @Override
    protected void loadDriver() {
        System.out.println("PdfPrinter.loadDriver");
    }

    @Override
    protected void printContent(String content) {
        System.out.println("PdfPrinter.printContent");
    }

    @Override
    protected void shutdown() {
        System.out.println("PdfPrinter.shutdown");
    }
}
