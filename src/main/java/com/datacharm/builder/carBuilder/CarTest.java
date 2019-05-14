package com.datacharm.builder.carBuilder;

public class CarTest {
    public static void main(String[] args) {
        CarBuilder carBuilder = new BuilderA();
        Employee employee = new Employee(carBuilder);
        Car car = employee.build();
        System.out.println(car.toString());
    }
}
