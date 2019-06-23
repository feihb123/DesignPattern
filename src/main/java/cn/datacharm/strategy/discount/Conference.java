package cn.datacharm.strategy.discount;

/**
 * 会议折扣固定-120 （不能和别的叠加）
 * @author datacharm.cn
 */
public class Conference implements SingleDiscount{
    @Override
    public double discount(double price) {
        return price - 120;
    }
}
