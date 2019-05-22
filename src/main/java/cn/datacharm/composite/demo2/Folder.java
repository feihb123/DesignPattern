package cn.datacharm.composite.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author datacharm.cn
 */
public class Folder extends File {
    List<File> files = new ArrayList<>();

    public Folder(String name){
        this.name = name;
    }

    public void add(File file){
        files.add(file);
    }
    public void remove(File file){
        files.remove(file);
    }

    @Override
    public void display() {
        System.out.println("进入文件夹"+name);
        for (File file:files){
            file.display();
        }
    }
}
