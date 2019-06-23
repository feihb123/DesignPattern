package cn.datacharm.strategy.discount;

/**
 * 金卡打八折
 * @author datacharm.cn
 */
public class GoldMember implements Discount{
    @Override
    public double subtract(double price) {
        System.out.println("金卡打八折");
        return price*0.8;
    }
}
