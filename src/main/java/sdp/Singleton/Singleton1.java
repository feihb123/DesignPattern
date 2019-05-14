package sdp.Singleton;


/**
 * 饿汉式单例模式
 */
public class Singleton1 {
    private final static Singleton1 INSTANCE = new Singleton1();

    private Singleton1(){

    }

    public  static Singleton1 getInstance() {
        return INSTANCE;
    }
}
