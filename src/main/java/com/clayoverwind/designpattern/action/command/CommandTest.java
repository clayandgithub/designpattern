package com.clayoverwind.designpattern.action.command;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @author clayoverwind
 * @version 2017/6/12
 * @E-mail clayanddev@163.com
 */
public class CommandTest {
    @Test
    public void test() {
        Manager manager = new Manager();
        Worker worker = new Worker();
        List<Command> commandList = new LinkedList<>();
        commandList.add(new DesignCommand(worker));
        commandList.add(new ProgramCommand(worker));
        commandList.stream().forEach(manager::executeCommand);
    }
}
