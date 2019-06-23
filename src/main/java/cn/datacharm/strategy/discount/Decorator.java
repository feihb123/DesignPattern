package cn.datacharm.strategy.discount;

/**
 * 折扣装饰类
 * @author datacharm.cn
 */
public abstract  class Decorator implements Discount{
    Discount discount;

    public Decorator(Discount discount) {
        this.discount = discount;
    }

    //当前折扣
    public abstract double subtract(double price);

    //用来计算之前所有的折扣
    public double sub(double price){
        return discount.subtract(price);
    }
}
