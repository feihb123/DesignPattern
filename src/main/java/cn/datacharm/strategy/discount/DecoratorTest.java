package cn.datacharm.strategy.discount;

/**
 * @author datacharm.cn
 */
public class DecoratorTest {
    public static void main(String[] args) {
        GoldMember goldMember = new GoldMember();
        Decorator decorator = new StaffDiscount(goldMember);
        Decorator d2 = new OffSeason(decorator);
        System.out.println(d2.subtract(100));
        SingleDiscount conference = new Conference();
        System.out.println(conference.discount(500));

    }
}
