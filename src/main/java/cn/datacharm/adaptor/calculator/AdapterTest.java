package cn.datacharm.adaptor.calculator;

/**
 * @author datacharm.cn
 */
public class AdapterTest {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        double x = adapter.calculateExp2(2);
        System.out.println(x);
    }
}
