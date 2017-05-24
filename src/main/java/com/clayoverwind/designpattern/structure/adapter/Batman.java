package com.clayoverwind.designpattern.structure.adapter;

/**
 * @author clayoverwind
 * @version 2017/5/24
 * @E-mail clayanddev@163.com
 */
public class Batman extends Person implements Hero {

    @Override
    public String saveTheEarth() {
        return "saveTheEarth";
    }
}
