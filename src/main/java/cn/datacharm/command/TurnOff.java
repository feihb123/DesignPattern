package cn.datacharm.command;

import java.util.List;

/**
 * 关灯指令
 * @author datacharm.cn
 */
public class TurnOff implements Command {
    Light light;

    public TurnOff(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
