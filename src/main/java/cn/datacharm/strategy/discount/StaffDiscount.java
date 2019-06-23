package cn.datacharm.strategy.discount;

/**
 * 员工 折扣减50
 * @author datacharm.cn
 */
public class StaffDiscount extends Decorator {

    double off = 50;

    public StaffDiscount(Discount discount) {
        super(discount);
    }

    @Override
    public double subtract(double price) {
        double money = sub(price) - off;
        System.out.println("员工价-50");
        return money;
    }

}
