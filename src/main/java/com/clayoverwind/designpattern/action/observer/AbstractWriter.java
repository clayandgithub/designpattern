package com.clayoverwind.designpattern.action.observer;

import com.clayoverwind.designpattern.util.DebugUtil;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author clayoverwind
 * @version 2017/6/7
 * @E-mail clayanddev@163.com
 */
public class AbstractWriter implements Writer {
    Set<Reader> readerList = new HashSet<>();

    @Override
    public void addReader(Reader reader) {
        DebugUtil.printCurrentMethodInfo();
        readerList.add(reader);
    }

    @Override
    public void removeReader(Reader reader) {
        DebugUtil.printCurrentMethodInfo();
        readerList.remove(reader);
    }

    @Override
    public void notifyReaders(String articleContent) {
        DebugUtil.printCurrentMethodInfo();
        System.out.println();
        for (Reader reader : readerList) {
            reader.readArticle(articleContent);
        }
    }

    @Override
    public void writeArticle() {
        DebugUtil.printCurrentMethodInfo();
        notifyReaders("This is the content of article written by writer.");
    }
}
