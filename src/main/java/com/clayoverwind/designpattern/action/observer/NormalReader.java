package com.clayoverwind.designpattern.action.observer;

import com.clayoverwind.designpattern.util.DebugUtil;

/**
 * @author clayoverwind
 * @version 2017/6/7
 * @E-mail clayanddev@163.com
 */
public class NormalReader implements Reader {
    @Override
    public void readArticle(String article) {
        DebugUtil.printCurrentMethodInfo();
        System.out.println(article);
    }
}
