package cn.datacharm.command.demo;

/**
 * @author datacharm.cn
 */
public class BoardScreen {
    Menu menu;

    public BoardScreen(Menu menu) {
        this.menu = menu;
    }

    public void open(){
        System.out.println("OPEN!");
    }
    public void create(){
        System.out.println("CREATE!");
    }
    public void edit(){
        System.out.println("EDIT!");
    }


}
