package cn.datacharm.builder.carBuilder;

public class BuilderA extends CarBuilder {
    @Override
    void build() {
        car = new Car("engineA","wheelA",
                "undepanA","seatingA","outA");
    }
}
