package cn.datacharm.command.demo;

/**
 * @author datacharm.cn
 */
public class CreateCommand implements  Command {
    BoardScreen boardScreen;

    public CreateCommand(BoardScreen boardScreen) {
        this.boardScreen = boardScreen;
    }

    @Override
    public void execute() {
        boardScreen.create();
    }
}
