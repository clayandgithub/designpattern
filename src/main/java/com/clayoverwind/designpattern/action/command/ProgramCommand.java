package com.clayoverwind.designpattern.action.command;

import com.clayoverwind.designpattern.util.DebugUtil;

/**
 * @author clayoverwind
 * @version 2017/6/12
 * @E-mail clayanddev@163.com
 */
public class ProgramCommand implements Command {
    private Programmer programmer;

    public ProgramCommand(Programmer programmer) {
        this.programmer = programmer;
    }

    @Override
    public void execute() {
        DebugUtil.printCurrentMethodInfo();
        if (programmer != null) {
            programmer.program();
        }
    }
}
