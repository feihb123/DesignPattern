package cn.datacharm.memento;

/**
 * 备忘录模式
 * @author datacharm.cn
 */
public class MementorTest {
    public static void main(String[] args) {
        //记录状态
        Originator originator = new Originator();
        originator.setState("第一次记录");
        originator.show();
        //保存备忘录
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(originator.getMemento());
        //改变记录
        originator.setState("第二次记录");
        originator.show();
        //回退状态
        originator.setState(careTaker.getMemento());
        originator.show();
    }
}
