package cn.datacharm.decorator.TeaWithMilk;

/**
 * @author datacharm.cn
 */
public class PuddingMilkTea extends MilkyTeaDecorator {

    public PuddingMilkTea(Milk milk) {
        super(milk);
    }

    @Override
    public String add() {
        String add = milk.add();
        System.out.println("添加布丁->布丁" + add + "奶茶");

        return "布丁" + add ;
    }


}
