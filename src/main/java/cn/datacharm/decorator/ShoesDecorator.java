package cn.datacharm.decorator;

/**
 * @author datacharm.cn
 */
public class ShoesDecorator extends Equipment{
    public ShoesDecorator(Hero hero) {
        super(hero);
    }

    @Override
    public void equip() {
        System.out.println("装备疾跑鞋");
        super.equip();
    }
}
