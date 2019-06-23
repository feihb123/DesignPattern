package cn.datacharm.statepattern.hotel;

/**
 * 已住状态 -> 红色表示
 * @author datacharm.cn
 */
public class Reside implements State {
    @Override
    public void show() {
        System.out.print("红色");
    }
}
