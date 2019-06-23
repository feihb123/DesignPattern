package cn.datacharm.statepattern.hotel;

/**
 * 维修中状态 -> 黑色表示
 * @author datacharm.cn
 */
public class Repair implements State {
    @Override
    public void show() {
        System.out.print("黑色");
    }
}
