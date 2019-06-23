package cn.datacharm.strategy.discount;

/**
 * 不叠加折上折的折扣接口类
 * @author datacharm.cn
 */
public interface SingleDiscount {
    double discount(double price);
}
