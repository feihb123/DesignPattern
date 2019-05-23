package cn.datacharm.visitor;

/**
 * @author datacharm.cn
 */
public class BOSS implements AccountView {
    @Override
    public void view(ConsumerBill consumerBill) {
        System.out.println("BOSS购买"+consumerBill.getItem()+"花费"+consumerBill.getAccount());
    }

    @Override
    public void view(IncomeBill incomeBill) {
        System.out.println("BOSS利用"+incomeBill.getItem()+"收入"+incomeBill.getAccount());

    }
}
