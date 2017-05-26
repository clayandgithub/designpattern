package com.clayoverwind.designpattern.structure.proxy;

/**
 * @author clayoverwind
 * @version 2017/5/26
 * @E-mail clayanddev@163.com
 */
public class NormalPlayer implements Player {
    @Override
    public String play() {
        return "NormalPlayer is playing.";
    }
}
