package cn.datacharm.command.demo;

/**
 * @author datacharm.cn
 */
public class EditCommand implements  Command {
    BoardScreen boardScreen;

    public EditCommand(BoardScreen boardScreen) {
        this.boardScreen = boardScreen;
    }

    @Override
    public void execute() {
        boardScreen.edit();
    }
}
