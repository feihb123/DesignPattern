package cn.datacharm.decorator.demo;

/**
 * @author datacharm.cn
 */
public class FlyCar extends Decorator {
    public FlyCar(ICar car) {
        super(car);
    }

    public void fly(){
        System.out.println("可以飞了。");
    }
    @Override
    public void move() {
        car.move();
        fly();
    }
}
