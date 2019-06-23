package cn.datacharm.decorator.TeaWithMilk;

/**
 * @author datacharm.cn
 */
public class DecoratorTest {
    public static void main(String[] args) {
        new PearlMilkTea(new PuddingMilkTea(new MilkWithBlackTea())).add();

    }
}
