package cn.datacharm.statepattern.Hero;

/**
 * @author datacharm.cn
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Hero hero = new Hero(new Common());
        hero.start();
        hero.setState(new Swim());
        hero.start();
    }
}
