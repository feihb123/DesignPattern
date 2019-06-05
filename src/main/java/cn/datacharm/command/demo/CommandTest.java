package cn.datacharm.command.demo;

/**
 * @author datacharm.cn
 */
public class CommandTest {
    public static void main(String[] args) {
        Menu menu = new Menu();
        BoardScreen boardScreen = new BoardScreen(menu);
        MenuItem mopen = new MenuItem("打开");
        mopen.setCommand(new OpenCommand(boardScreen));
        MenuItem mcreate = new MenuItem("创建");
        mcreate.setCommand(new CreateCommand(boardScreen));
        MenuItem medit = new MenuItem("编辑");
        medit.setCommand(new EditCommand(boardScreen));
        menu.addMenuItem(mcreate);
        menu.addMenuItem(mopen);
        menu.addMenuItem(medit);

        for(MenuItem item:menu.items){
            System.out.println("点击了"+item.getName()+"按钮");
            item.click();
        }


    }
}
