package cn.datacharm.strategy.discount;

/**
 * 淡季打九折
 * @author datacharm.cn
 */
public class OffSeason extends Decorator {

    public OffSeason(Discount discount) {
        super(discount);
    }

    @Override
    public double subtract(double price) {
        double moeney = sub(price)*0.9;
        System.out.println("淡季打九折");
        return moeney;
    }
}
