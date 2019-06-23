package cn.datacharm.decorator.TeaWithMilk;

/**
 * @author datacharm.cn
 */
public class PearlMilkTea extends MilkyTeaDecorator {

    public PearlMilkTea(Milk milk) {
        super(milk);
    }

    @Override
    public String add() {
        String add = milk.add();
        System.out.println("添加珍珠->珍珠" + add + "奶茶");
        return "珍珠" + add;
    }


}
