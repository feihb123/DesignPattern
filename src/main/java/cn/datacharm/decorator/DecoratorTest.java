package cn.datacharm.decorator;

/**
 * @author datacharm.cn
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Teemo teemo = new Teemo("提莫");
        Equipment armour = new ArmourDecorator(teemo);
        armour.equip();
        Equipment shoes = new ShoesDecorator(teemo);
        shoes.equip();
    }
}
