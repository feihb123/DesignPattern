package cn.datacharm.strategy.discount;

/**
 * 叠加折上折的打折类接口
 * @author datacharm.cn
 */
public interface Discount {
    double subtract(double price);
}
