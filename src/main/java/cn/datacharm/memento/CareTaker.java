package cn.datacharm.memento;

/**
 * 负责人  -保存备忘录
 * @author datacharm.cn
 */
public class CareTaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
