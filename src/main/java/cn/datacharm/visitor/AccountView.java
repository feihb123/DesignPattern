package cn.datacharm.visitor;

/**
 * 访问者可以进行的操作
 * @author datacharm.cn
 */
public interface AccountView {
    void view(ConsumerBill consumerBill);
    void view(IncomeBill incomeBill);

}
