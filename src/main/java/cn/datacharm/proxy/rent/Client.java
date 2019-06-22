package cn.datacharm.proxy.rent;

/**
 * @author datacharm.cn
 */
public class Client {
    public static void main(String[] args) {
        Buyer buyer = new Buyer("name");
        Proxy proxy = new Proxy(buyer);
        proxy.rent();
    }
}
