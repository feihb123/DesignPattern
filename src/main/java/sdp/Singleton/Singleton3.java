package sdp.Singleton;

/**
 * 静态内部类单例模式
 */
public class Singleton3 {
    private Singleton3(){

    }
    private static class SingletonInstance{
        private static final Singleton3 INSTANCE= new Singleton3();
    }
    public Singleton3 getInstance(){
        return SingletonInstance.INSTANCE;
    }

}
