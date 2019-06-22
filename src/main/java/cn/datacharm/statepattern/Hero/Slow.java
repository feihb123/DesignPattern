package cn.datacharm.statepattern.Hero;

/**
 * @author datacharm.cn
 */
public class Slow implements State {
    @Override
    public void handle() throws Exception {
        System.out.println("减速3s");
        Thread.sleep(3000);
    }
}
