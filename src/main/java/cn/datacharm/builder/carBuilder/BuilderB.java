package cn.datacharm.builder.carBuilder;

public class BuilderB extends CarBuilder {
    @Override
    void build() {
        car = new Car("engineB","wheelB",
                "undepanB","seatingB","outB");
    }
}
