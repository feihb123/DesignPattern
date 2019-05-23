package cn.datacharm.prototype;

/**
 * 原型模式 - 对象深克隆
 * @author datacharm.cn
 */
public class ProtoTypeTest {
    public static void main(String[] args) {
        MonkeyKing m1 = new MonkeyKing("m1");
        System.out.println(m1+"-"+m1.getName());
        MonkeyKing m2 = m1.clone();
        System.out.println(m2+"-"+m2.getName());
    }
}
