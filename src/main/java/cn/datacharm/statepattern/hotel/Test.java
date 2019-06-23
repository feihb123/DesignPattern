package cn.datacharm.statepattern.hotel;

/**
 * @author datacharm.cn
 */
public class Test {
    public static void main(String[] args) {
        Floor floor = new Floor();
        Room r1 = new StandardRoom();
        r1.setState(new Free());
        Room r2 = new SingleRoom();
        r2.setState(new Reside());
        Room r3 = new ThreeRoom();
        r3.setState(new Repair());
        floor.add(r1);
        floor.add(r2);
        floor.add(r3);

        floor.show();
    }
}
