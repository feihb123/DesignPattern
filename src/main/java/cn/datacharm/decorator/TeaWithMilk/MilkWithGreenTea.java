package cn.datacharm.decorator.TeaWithMilk;

/**
 * @author datacharm.cn
 */
public class MilkWithGreenTea implements Milk {
    @Override
    public String add() {
        System.out.println("添加绿茶->绿茶奶茶");
        return "绿茶";
    }
}
