package cn.datacharm.memento;


/**
 * 备忘录发起者 -保存状态和回退备忘录
 * @author datacharm.cn
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获得备忘录
     */
    public Memento getMemento(){
        return new Memento(state);
    }

    /**
     * 设置新状态
     */
    public void setState(Memento memento) {
        this.state = memento.getState();
    }

    public void show(){
        System.out.println("当前状态："+state);
    }

}
