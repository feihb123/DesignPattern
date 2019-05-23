package cn.datacharm.visitor;

/**
 * @author datacharm.cn
 */
public class VisitorTest {
    public static void main(String[] args) {
        //Bill可以接受不同访问者
        ConsumerBill consumerBill = new ConsumerBill("a",11);
        consumerBill.accept(new BOSS());
        consumerBill.accept(new Accountant());

        IncomeBill incomeBill = new IncomeBill("b",22);
        incomeBill.accept(new BOSS());

    }
}
