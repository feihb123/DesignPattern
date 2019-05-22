package cn.datacharm.composite.demo2;

/**
 * @author datacharm.cn
 */
public class TextFile extends  File {

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("访问文本"+name);
    }
}
