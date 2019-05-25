package cn.datacharm.proxy.demo;

/**
 * @author datacharm.cn
 */
public class ProxyTest {
    public static void main(String[] args) {

        IUser userProxy = new UserProxy();
        userProxy.addUser();
        userProxy.deleteUser();
    }
}
