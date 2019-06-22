package cn.datacharm.proxy.rent;

/**
 * @author datacharm.cn
 */
public class Proxy implements Rent {
    Buyer buyer;

    public Proxy(Buyer buyer) {
        this.buyer = buyer;
    }

    @Override
    public void rent() {
        buyer.rent();
        handle();
    }

    public void handle(){
        System.out.println("解决方案：我们帮"+buyer.getName()+"找房子");
    }
}
