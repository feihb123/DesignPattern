package cn.datacharm.decorator;

/**
 * @author datacharm.cn
 */
public class ArmourDecorator extends Equipment{
    public ArmourDecorator(Hero hero) {
        super(hero);
    }

    @Override
    public void equip() {
        System.out.println("装备了反甲");
        hero.equip();
    }
}
