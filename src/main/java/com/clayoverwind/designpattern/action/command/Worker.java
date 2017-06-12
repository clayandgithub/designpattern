package com.clayoverwind.designpattern.action.command;

import com.clayoverwind.designpattern.util.DebugUtil;

/**
 * @author clayoverwind
 * @version 2017/6/12
 * @E-mail clayanddev@163.com
 */
public class Worker implements Programmer, Designer {
    @Override
    public void program() {
        DebugUtil.printCurrentMethodInfo();
    }

    @Override
    public void design() {
        DebugUtil.printCurrentMethodInfo();
    }
}
