package cn.datacharm.observer;

/**
 * @author datacharm.cn
 */
public class ObserverTest {
    public static void main(String[] args) {
        Observer user1 = new User("user1");
        Observer user2 = new User("user2");
        Observer user3 = new User("user3");
        Server server = new Server();
        server.register(user1);
        server.register(user2);
        server.register(user3);
        server.setMessage("推送一篇文章");
        server.remove(user3);
        server.setMessage("又推送一篇文章");

    }
}
