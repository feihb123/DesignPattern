package cn.datacharm.factory.factoryMethod;

/**
 * @author datacharm.cn
 */
public class BFactory implements Factory{
    @Override
    public ICar create() {
        return new CarB();
    }
}
