package cn.datacharm.visitor;

/**
 * @author datacharm.cn
 */
public class ConsumerBill implements Bill{
    private String item;
    private double account;

    public ConsumerBill(String item, double account) {
        this.item = item;
        this.account = account;
    }

    @Override
    public void accept(AccountView accountView) {
        accountView.view(this);
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }
}
