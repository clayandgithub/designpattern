package com.clayoverwind.designpattern.structure.proxy;

/**
 * @author clayoverwind
 * @version 2017/5/26
 * @E-mail clayanddev@163.com
 */
public class Proxy implements Player {

    private Player originalPlayer;

    public Proxy(Player originalPlayer) {
        this.originalPlayer = originalPlayer;
    }

    @Override
    public String play() {
        return originalPlayer.play() + " Proxy is playing.";
    }
}
