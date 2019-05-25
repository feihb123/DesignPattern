package cn.datacharm.factory.factoryMethod;

/**
 * @author datacharm.cn
 */
public class FactoryTest {
    public static void main(String[] args) {
        Factory a = new AFactory();
        Factory b = new BFactory();
        a.create().run();
        b.create().run();
    }
}
