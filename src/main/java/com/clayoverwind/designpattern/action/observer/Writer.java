package com.clayoverwind.designpattern.action.observer;

/**
 * @author clayoverwind
 * @version 2017/6/7
 * @E-mail clayanddev@163.com
 */
public interface Writer {
    void addReader(Reader reader);

    void removeReader(Reader reader);

    void notifyReaders(String articleContent);

    void writeArticle();
}
