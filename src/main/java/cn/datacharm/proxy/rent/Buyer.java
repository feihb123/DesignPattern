package cn.datacharm.proxy.rent;

/**
 * @author datacharm.cn
 */
public class Buyer implements Rent {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Buyer(String name) {
        this.name = name;
    }

    @Override
    public void rent() {
        System.out.println("需求：我想租房，便宜的");
    }
}
