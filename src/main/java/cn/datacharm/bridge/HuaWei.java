package cn.datacharm.bridge;

/**
 * @author datacharm.cn
 */
public class HuaWei extends Phone {

    public HuaWei(String name, SoftWare softWare) {
        super(name, softWare);
    }

    @Override
    public void run() {
        System.out.println(name+"启动了软件:");
        softWare.run();
    }
}
