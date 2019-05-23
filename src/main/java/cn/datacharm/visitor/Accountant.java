package cn.datacharm.visitor;

/**
 * @author datacharm.cn
 */
public class Accountant implements AccountView {
    @Override
    public void view(ConsumerBill consumerBill) {
        System.out.println("会计统计支出："+consumerBill.getItem()+"---"+consumerBill.getAccount());
    }

    @Override
    public void view(IncomeBill incomeBill) {
        System.out.println("会计统计收入："+incomeBill.getItem()+"---"+incomeBill.getAccount());

    }
}
