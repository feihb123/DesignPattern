package cn.datacharm.composite.demo2;

/**
 * @author datacharm.cn
 */
public class ImageFile extends  File {

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("访问图片"+name);
    }
}
