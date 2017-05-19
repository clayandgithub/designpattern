package com.clayoverwind.designpattern.create.simplefactory;

import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * @author clayoverwind
 * @version 2017/5/18
 * @E-mail clayanddev@163.com
 */
public class BlizzardGameFactory {

    public static Game createDiablo() {
        return new Diablo();
    }

    public static Game createOverWatch() {
        return new OverWatch();
    }

    public Game createGameByName(String gameName) {
        Game ret = null;
        switch (gameName) {
            case "Diablo":
                ret = new Diablo();
                break;
            case "OverWatch":
                ret = new OverWatch();
                break;
            default:
                throw new IllegalArgumentException(String.format("There is no game called %s", gameName));
        }
        return ret;
    }
}
