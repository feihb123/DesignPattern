package cn.datacharm.decorator.demo;

/**
 * @author datacharm.cn
 */
public class Decorator extends Car{
    ICar car;

    public Decorator(ICar car) {
        this.car = car;
    }



    public ICar getCar() {
        return car;
    }

    public void setCar(ICar car) {
        this.car = car;
    }


}
