package cn.datacharm.factory.factoryMethod;

/**
 * @author datacharm.cn
 */
public class AFactory implements Factory{
    @Override
    public ICar create() {
        return new CarA();
    }
}
