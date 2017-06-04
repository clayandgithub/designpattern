package com.clayoverwind.designpattern.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author clayoverwind
 * @version 2017/6/4
 * @E-mail clayanddev@163.com
 */
public class HeroFactory {
    private static Map<String, Hero> heroMap = new HashMap<>();

    public static Hero getHeroByName(String name) {
        Hero ret = heroMap.get(name);
        if (ret == null) {
            ret = new Hero(name);
            heroMap.put(name, ret);
        }

        return ret;
    }
}
