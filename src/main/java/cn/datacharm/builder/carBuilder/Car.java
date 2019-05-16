package cn.datacharm.builder.carBuilder;

public class Car {
    String engine;
    String wheel;
    String underpan;
    String seating;
    String out;

    public Car(String engine, String wheel, String underpan, String seating, String out) {
        this.engine = engine;
        this.wheel = wheel;
        this.underpan = underpan;
        this.seating = seating;
        this.out = out;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheel='" + wheel + '\'' +
                ", underpan='" + underpan + '\'' +
                ", seating='" + seating + '\'' +
                ", out='" + out + '\'' +
                '}';
    }
}
