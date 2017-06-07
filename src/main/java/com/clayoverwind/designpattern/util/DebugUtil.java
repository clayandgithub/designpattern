package com.clayoverwind.designpattern.util;

/**
 * @author clayoverwind
 * @version 2017/6/7
 * @E-mail clayanddev@163.com
 */
public class DebugUtil {
    public static void printCurrentMethodInfo() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.printf("%s.%s\n", elements[2].getClassName().substring(elements[2].getClassName().lastIndexOf('.') + 1), elements[2].getMethodName());
    }

    public static void printCurrentMethodDetailInfo() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        System.out.printf("%s.%s\n", elements[2].getClassName(), elements[2].getMethodName());
    }
}
