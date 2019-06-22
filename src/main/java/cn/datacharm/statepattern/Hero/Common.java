package cn.datacharm.statepattern.Hero;

/**
 * @author datacharm.cn
 */
public class Common implements State {
    @Override
    public void handle() throws Exception {
        System.out.println("正常状态:能奔能跳");
    }
}
