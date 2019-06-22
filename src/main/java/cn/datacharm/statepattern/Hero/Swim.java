package cn.datacharm.statepattern.Hero;

/**
 * @author datacharm.cn
 */
public class Swim implements State {
    @Override
    public void handle() throws Exception {
        System.out.println("被晕眩3s");
        Thread.sleep(3000);
    }
}
