package cn.datacharm.command;

/**
 * 命令接受者  Reiver
 * @author datacharm.cn
 */
public class Light {
    public void turnOn(){
        System.out.println("开灯...");
    }

    public void turnOff(){
        System.out.println("关灯...");
    }

    public void adjust(){
        System.out.println("调节亮度...");
    }
}
