package com.clayoverwind.designpattern.action.command;

/**
 * @author clayoverwind
 * @version 2017/6/12
 * @E-mail clayanddev@163.com
 */
public class Manager {
    public void executeCommand(Command command) {
        command.execute();
    }
}
