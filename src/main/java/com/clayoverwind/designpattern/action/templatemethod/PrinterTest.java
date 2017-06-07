package com.clayoverwind.designpattern.action.templatemethod;

import org.junit.Test;

/**
 * @author clayoverwind
 * @version 2017/6/6
 * @E-mail clayanddev@163.com
 */
public class PrinterTest {

    @Test
    public void test() {
        Printer printer = new PdfPrinter();
        printer.print("test");
        printer = new XmlPrinter();
        printer.print("test");
    }
}
