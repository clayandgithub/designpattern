package com.clayoverwind.designpattern.action.iterator;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author clayoverwind
 * @version 2017/6/9
 * @E-mail clayanddev@163.com
 */
public class IteratorTest {

    @Test
    public void test() throws FileNotFoundException {
        LineIterableFile lineIterableFile = new LineIterableFile(new File(".gitignore"));
        for (String line : lineIterableFile) {
            System.out.println(line);
        }
    }
}
