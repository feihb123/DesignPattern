package cn.datacharm.adaptor.calculator;

/**
 * 适配Power的并实现目的Square的类
 * @author datacharm.cn
 */
public class Adapter implements Square{
    private Power power;

    public Adapter() {
        power = new Power();
    }

    @Override
    public double calculateExp2(int base) {
        double value = power.caluator(base,2);
        return value;
    }
}
