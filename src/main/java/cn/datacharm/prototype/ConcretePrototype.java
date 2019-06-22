package cn.datacharm.prototype;

/**
 * @author datacharm.cn
 */
public class ConcretePrototype implements Prototype,Cloneable{
    @Override
    public Object clone() {
        ConcretePrototype concretePrototype = null;
        try {
            concretePrototype =(ConcretePrototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return concretePrototype;
    }
}
