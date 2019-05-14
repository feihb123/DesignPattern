package com.datacharm.factory;

public class LowCar implements ICar {
    public String getType() {
        return "LowCar";
    }

    public void run() {
        System.out.println("LowCar run!");
    }
}
