package cn.datacharm.statepattern.hotel;

/**
 * 空闲状态 -> 绿色表示
 * @author datacharm.cn
 */
public class Free implements State {
    @Override
    public void show() {
        System.out.print("绿色");
    }
}
