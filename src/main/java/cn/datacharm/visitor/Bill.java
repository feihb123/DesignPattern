package cn.datacharm.visitor;

/**
 * 账单接口，可以接受访问者
 * @author datacharm.cn
 */
public interface Bill {
    void accept(AccountView accountView);
}
