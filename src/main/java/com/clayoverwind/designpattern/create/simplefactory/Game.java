package com.clayoverwind.designpattern.create.simplefactory;

/**
 * @author clayoverwind
 * @version 2017/5/18
 * @E-mail clayanddev@163.com
 */
public abstract class Game {
    private String name;

    public Game(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Game : " + name;
    }
}
