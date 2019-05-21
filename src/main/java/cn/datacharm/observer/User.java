package cn.datacharm.observer;

/**
 * 观察者 - 用户
 * @author datacharm.cn
 */
public class User implements Observer {
    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }
    public void read(){
        System.out.println(name + "收到:" + message);
    }
}
