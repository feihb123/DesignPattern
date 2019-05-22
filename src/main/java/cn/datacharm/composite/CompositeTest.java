package cn.datacharm.composite;


/**
 * @author datacharm.cn
 */
public class CompositeTest{
    public static void main(String[] args) {
        Component c0=new Branch("C0");
        Component c1=new Branch("C1");
        Component leaf1=new Leaf("1");
        Component leaf2=new Leaf("2");
        Component leaf3=new Leaf("3");
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();

    }
}

