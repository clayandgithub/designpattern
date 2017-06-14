package com.clayoverwind.designpattern.action.state;

import com.clayoverwind.designpattern.util.DebugUtil;
import jdk.nashorn.internal.runtime.Debug;

/**
 * @author clayoverwind
 * @version 2017/6/14
 * @E-mail clayanddev@163.com
 */
public class Context {
    private State currentState;

    public void handle() {
        DebugUtil.printCurrentMethodInfo();
        if(currentState != null) {
            currentState.handle(this);
        }
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
