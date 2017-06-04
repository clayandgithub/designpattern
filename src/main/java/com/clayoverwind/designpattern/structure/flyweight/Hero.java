package com.clayoverwind.designpattern.structure.flyweight;

/**
 * @author clayoverwind
 * @version 2017/6/4
 * @E-mail clayanddev@163.com
 */
public class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
