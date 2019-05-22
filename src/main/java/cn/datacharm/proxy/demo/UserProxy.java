package cn.datacharm.proxy.demo;

/**
 * 代理类
 * @author datacharm.cn
 */
public class UserProxy implements IUser {
    private IUser user;

    public UserProxy(IUser user) {
        this.user = user;
    }

    @Override
    public void addUser() {
        System.out.println("添加用户前操作");
        user.addUser();
        System.out.println("添加用户后操作");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户前操作");
        user.deleteUser();
        System.out.println("删除用户后操作");
    }
}
