package com.clayoverwind.designpattern.action.command;

import com.clayoverwind.designpattern.util.DebugUtil;

/**
 * @author clayoverwind
 * @version 2017/6/12
 * @E-mail clayanddev@163.com
 */
public class DesignCommand implements Command {
    private Designer designer;

    public DesignCommand(Designer designer) {
        this.designer = designer;
    }

    @Override
    public void execute() {
        DebugUtil.printCurrentMethodInfo();
        if (designer != null) {
            designer.design();
        }
    }
}
