package cn.datacharm.command.demo;

/**
 * @author datacharm.cn
 */
public class MenuItem {
    String name;
    Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public MenuItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void click(){
        command.execute();
    }
}
