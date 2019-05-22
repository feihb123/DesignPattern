package cn.datacharm.decorator.demo;

/**
 * @author datacharm.cn
 */
public class SwimCar extends Decorator {

    public SwimCar(ICar car) {
        super(car);
    }

    public void swim(){
        System.out.println("可以游泳了。");
    }
    @Override
    public void move() {
        car.move();
        swim();
    }

}
