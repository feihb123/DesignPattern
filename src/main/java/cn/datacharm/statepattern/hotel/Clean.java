package cn.datacharm.statepattern.hotel;

/**
 * 清理中状态 -> 白色表示
 * @author datacharm.cn
 */
public class Clean implements State {
    @Override
    public void show() {
        System.out.print("白色");
    }
}
