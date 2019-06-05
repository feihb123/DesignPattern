package cn.datacharm.command.demo;

/**
 * @author datacharm.cn
 */
public class OpenCommand implements  Command {
    BoardScreen boardScreen;

    public OpenCommand(BoardScreen boardScreen) {
        this.boardScreen = boardScreen;
    }

    @Override
    public void execute() {
        boardScreen.open();
    }
}
