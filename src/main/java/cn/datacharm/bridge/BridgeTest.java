package cn.datacharm.bridge;

/**
 * @author datacharm.cn
 */
public class BridgeTest {
    public static void main(String[] args) {
        Phone huaWei = new HuaWei("华为手机",new QQ());
        huaWei.run();
        Phone xiaoMi = new XiaoMi("小米手机",new Wechat());
        xiaoMi.run();

    }
}
