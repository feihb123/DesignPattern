package cn.datacharm.builder.carBuilder;

public class Employee {
    CarBuilder carBuilder;

    public Employee(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car build(){
        carBuilder.build();
        return carBuilder.getCar();
    }
}
