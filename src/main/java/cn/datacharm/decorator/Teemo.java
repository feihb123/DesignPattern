package cn.datacharm.decorator;

/**
 * @author datacharm.cn
 */
public class Teemo implements Hero{
    private String name;

    public Teemo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void equip() {
        System.out.println("装备完成！");
    }
}
