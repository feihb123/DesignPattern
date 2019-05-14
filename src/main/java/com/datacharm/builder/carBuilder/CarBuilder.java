package com.datacharm.builder.carBuilder;

public abstract class CarBuilder {
    Car car = new Car();
    //构造器注入
    abstract void build();
    Car getCar(){
        return car;
    }
}
