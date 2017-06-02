package com.clayoverwind.designpattern.structure.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * @author clayoverwind
 * @version 2017/6/2
 * @E-mail clayanddev@163.com
 */
public class Blizzard {
    private List<Game> games = new LinkedList<>();

    public void addGame(Game game) {
        games.add(game);
    }

    public void printGames() {
        for (Game game : games) {
            System.out.println(game.toString());
        }
    }
}
