package cn.datacharm.decorator.TeaWithMilk;

/**
 * @author datacharm.cn
 */
public class MilkWithBlackTea implements Milk {
    @Override
    public String add() {
        System.out.println("添加红茶->红茶奶茶");
        return "红茶";
    }
}
