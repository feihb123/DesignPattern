package cn.datacharm.decorator.demo;

/**
 * @author datacharm.cn
 */
public class DecoratorTest {
    public static void main(String[] args) {
        ICar car = new Car();
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();
        SwimCar swimCar = new SwimCar(flyCar);
        swimCar.move();
    }
}
