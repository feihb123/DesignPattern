package cn.datacharm.iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Aggregate ag=new ConcreteAggregate();
        ag.add("信电工程学院");
        ag.add("化学化工学院");
        ag.add("机电工程学院");
        ag.add("食品工程学院");
        System.out.print("聚合的内容有：");
        Iterator it=ag.getIterator();
        while(it.hasNext()){
            Object ob=it.next();
            System.out.print(ob.toString()+"\t");
        }
        Object ob=it.first();
        System.out.println("\nFirst："+ob.toString());
    }
}
