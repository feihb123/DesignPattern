package cn.datacharm.prototype;

/**
 * @author datacharm.cn
 */
public class Test {

    public static void main(String[] args) {
        Prototype c1 = new ConcretePrototype();
        ConcretePrototype c2 =(ConcretePrototype) c1.clone();
        System.out.println(c1);
        System.out.println(c2);
    }
}
