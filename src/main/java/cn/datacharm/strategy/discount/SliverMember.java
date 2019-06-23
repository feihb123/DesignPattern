package cn.datacharm.strategy.discount;

/**
 * 银卡打九折
 * @author datacharm.cn
 */
public class SliverMember implements Discount{
    @Override
    public double subtract(double price) {
        System.out.println("银卡打九折");
        return price*0.9;
    }
}
