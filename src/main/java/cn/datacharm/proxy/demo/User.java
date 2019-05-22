package cn.datacharm.proxy.demo;

/**
 * 被代理用户
 * @author datacharm.cn
 */
public class User implements IUser {
    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }
}
