package cn.datacharm.decorator.TeaWithMilk;

/**
 * @author datacharm.cn
 */
public abstract class MilkyTeaDecorator implements Milk{
    Milk milk;

    public MilkyTeaDecorator(Milk milk) {
        this.milk = milk;
    }

    @Override
    public abstract String add();
}
