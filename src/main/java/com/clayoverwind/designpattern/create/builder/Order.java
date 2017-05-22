package com.clayoverwind.designpattern.create.builder;

/**
 * @author clayoverwind
 * @version 2017/5/22
 * @E-mail clayanddev@163.com
 */
public class Order {
    private String food;

    private String drink;

    private Integer count;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Order{" +
                "food='" + food + '\'' +
                ", drink='" + drink + '\'' +
                ", count=" + count +
                '}';
    }
}
