package cn.datacharm.Singleton;

/**
 * 双重校验锁懒汉式
 */
public class Singleton2 {
    /**
     * volatile保证了不同线程对这个变量进行操作时的可见性，
     * 即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。
     */
    private static volatile Singleton2 singleton;

    private Singleton2(){

    }

    public static Singleton2 getInstance(){
        if(singleton == null){
            synchronized (singleton){
                if(singleton == null){
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }


}
