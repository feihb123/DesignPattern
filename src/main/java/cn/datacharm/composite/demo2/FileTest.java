package cn.datacharm.composite.demo2;

/**
 * @author datacharm.cn
 */
public class FileTest {
    public static void main(String[] args) {
        File f1 = new TextFile("t1");
        File f2 = new ImageFile("i1");
        File f3 = new VedioFile("v1");
        Folder folder1 = new Folder("文件夹1");
        Folder folder2 = new Folder("文件夹2");

        folder1.add(folder2);
        folder1.add(f1);
        folder2.add(f1);
        folder2.add(f2);
        folder2.add(f3);
        folder1.display();
    }
}
