package com.clayoverwind.designpattern.create.abstractfactory;

/**
 * @author clayoverwind
 * @version 2017/5/19
 * @E-mail clayanddev@163.com
 */
public class KleiGameFactory implements GameFactory {
    @Override
    public Game createGame() {
        return new DontStarve();
    }
}
