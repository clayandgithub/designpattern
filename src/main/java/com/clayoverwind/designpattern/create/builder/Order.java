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

    private Boolean spicy;

    private Boolean cooled;

    public Order(OrderBuilder orderBuilder) {
        food = orderBuilder.getFood();
        drink = orderBuilder.getDrink();
        count = orderBuilder.getCount();
        spicy = orderBuilder.getSpicy();
        cooled = orderBuilder.getCooled();
    }

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

    public Boolean getSpicy() {
        return spicy;
    }

    public void setSpicy(Boolean spicy) {
        this.spicy = spicy;
    }

    public Boolean getCooled() {
        return cooled;
    }

    public void setCooled(Boolean cooled) {
        this.cooled = cooled;
    }

    @Override
    public String toString() {
        return "Order{" +
                "food='" + food + '\'' +
                ", drink='" + drink + '\'' +
                ", count=" + count +
                ", spicy=" + spicy +
                ", cooled=" + cooled +
                '}';
    }
}
