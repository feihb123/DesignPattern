package cn.datacharm.decorator.demo;

/**
 * @author datacharm.cn
 */
public class Car implements ICar {
    @Override
    public void move() {
        System.out.println("汽车启动！");
    }
}
