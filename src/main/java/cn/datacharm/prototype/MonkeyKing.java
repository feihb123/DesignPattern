package cn.datacharm.prototype;

/**
 * 孙悟空实现Cloneable接口克隆自己
 * @author datacharm.cn
 */
public class MonkeyKing implements Cloneable {
    private String name;

    public MonkeyKing(String name){
        this.name = name;
    }

    void setName(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 克隆该实例
     */
    @Override
    public MonkeyKing clone(){
        MonkeyKing monkeyKing = null;
        try {
            monkeyKing = (MonkeyKing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return monkeyKing;
    }
}

