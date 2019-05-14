package com.datacharm.builder;

public class KFCWaiter {
    MealBuilder builder;
    public KFCWaiter(MealBuilder builder){
        this.builder = builder;
    }

    public void setBuilder(MealBuilder builder) {
        this.builder = builder;
    }
    public Meal buildMeal(){
        builder.buildChicken();
        builder.buildChips();
        builder.buildCola();
        builder.buildHam();
        return builder.getResult();
    }

}
