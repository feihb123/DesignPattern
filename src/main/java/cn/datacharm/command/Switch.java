package cn.datacharm.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 开关  -接收命令者
 * @author datacharm.cn
 */
public class Switch {
    List<Command> commands;

    public Switch() {
        commands = new ArrayList<>();
    }

    public void receiveCommand(Command command){
        commands.add(command);
    }

    public void executeCommands(){
        for (Command command:commands){
            command.execute();
        }
        commands.clear();
    }



}
