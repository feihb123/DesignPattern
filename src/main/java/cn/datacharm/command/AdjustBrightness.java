package cn.datacharm.command;

/**
 * @author datacharm.cn
 */
public class AdjustBrightness implements Command{
    Light light;

    public AdjustBrightness(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.adjust();
    }
}
