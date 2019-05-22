package cn.datacharm.flyweight;

/**
 * @author datacharm.cn
 */
public class FlyWeightTest {
    public static void main(String[] args) throws Exception {
        Teemo teemo = new Teemo();
        teemo.release("Q");
        teemo.release("Q");
        teemo.release("R");
        teemo.release("R");
        teemo.release("R");
    }
}
