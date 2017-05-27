package com.clayoverwind.designpattern.structure.facade;

import java.awt.*;

/**
 * @author clayoverwind
 * @version 2017/5/27
 * @E-mail clayanddev@163.com
 */
public class Computer {
    private Cpu cpu;

    private Disk disk;

    private Memory memory;

    public Computer() {
        cpu = new Cpu();
        disk = new Disk();
        memory = new Memory();
    }

    public void startup(){
        System.out.println("Computer startup!");
        cpu.startup();
        disk.startup();
        memory.startup();
    }

    public void shutdown(){
        System.out.println("Computer shutdown!");
        cpu.startup();
        disk.startup();
        memory.startup();
    }
}
