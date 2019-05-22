package cn.datacharm.bridge;

/**
 * @author datacharm.cn
 */
public abstract class Phone {
    String name;
    SoftWare softWare;

    public Phone(String name,SoftWare softWare) {
        this.name = name;
        this.softWare = softWare;
    }

    public abstract void run();
}
