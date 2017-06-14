package com.clayoverwind.designpattern.action.state;

import com.clayoverwind.designpattern.util.DebugUtil;

/**
 * @author clayoverwind
 * @version 2017/6/14
 * @E-mail clayanddev@163.com
 */
public class StateB implements State {
    @Override
    public void handle(Context context) {
        DebugUtil.printCurrentMethodInfo();
    }
}
