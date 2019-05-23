package cn.datacharm.command;

/**
 * @author datacharm.cn
 */
public class CommandTest {
    public static void main(String[] args) {
        Light light = new Light();
        Command turnOn = new TurnOn(light);
        Command turnOff = new TurnOff(light);
        Command adjust = new AdjustBrightness(light);
        Switch switchs = new Switch();
        switchs.receiveCommand(turnOn);
        switchs.receiveCommand(adjust);
        switchs.receiveCommand(turnOff);
        switchs.executeCommands();

    }
}
