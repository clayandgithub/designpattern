package com.clayoverwind.designpattern.structure.decorator;

/**
 * @author clayoverwind
 * @version 2017/5/25
 * @E-mail clayanddev@163.com
 */
public class BatmanWithBatmobile implements Hero {
    private Batman batman = new Batman();
    @Override
    public String saveTheEarth() {
        return "Batman is in Batmobile." + batman.saveTheEarth();
    }
}
