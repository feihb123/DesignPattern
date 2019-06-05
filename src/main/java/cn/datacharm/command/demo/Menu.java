package cn.datacharm.command.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author datacharm.cn
 */
public class Menu {
    List<MenuItem> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public void addMenuItem(MenuItem menuItem){
        items.add(menuItem);
    }
}
