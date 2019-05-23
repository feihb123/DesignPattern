package cn.datacharm.command;

/**
 * 开灯指令
 * @author datacharm.cn
 */
public class TurnOn implements Command {
    Light light;

    public TurnOn(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.turnOn();
    }
}
