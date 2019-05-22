package cn.datacharm.composite.demo2;

/**
 * @author datacharm.cn
 */
public class VedioFile extends  File {

    public VedioFile(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("访问视频"+name);
    }
}
