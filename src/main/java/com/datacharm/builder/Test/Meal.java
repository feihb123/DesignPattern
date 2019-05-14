package com.datacharm.builder.Test;

public class Meal {
    String name;
    String price;

    public Meal(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public Meal() {
    }

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
