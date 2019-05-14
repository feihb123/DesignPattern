package com.datacharm.builder.Test;

public abstract class MealBuilder {
    Meal meal = new Meal();
    public abstract void build();
    public Meal getMeal(){
        return meal;
    };
}
