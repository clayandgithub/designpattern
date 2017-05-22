package com.clayoverwind.designpattern.create.builder;

/**
 * @author clayoverwind
 * @version 2017/5/22
 * @E-mail clayanddev@163.com
 */
public class OrderBuilder {
    // Required parameters
    private String food;

    private String drink;

    private Integer count;

    // Optional parameters - initialized to default values
    private Boolean spicy = false;

    private Boolean cooled = false;


    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public Integer getCount() {
        return count;
    }

    public Boolean getSpicy() {
        return spicy;
    }

    public Boolean getCooled() {
        return cooled;
    }

    public OrderBuilder setSpicy(Boolean spicy) {
        this.spicy = spicy;
        return this;
    }

    public OrderBuilder setCooled(Boolean cooled) {
        this.cooled = cooled;
        return this;
    }

    public OrderBuilder(String food, String drink, Integer count) {
        this.food = food;
        this.drink = drink;
        this.count = count;
    }

    public Order build() {
        return new Order(this);
    }
}