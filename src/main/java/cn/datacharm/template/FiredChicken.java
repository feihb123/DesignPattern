package cn.datacharm.template;

/**
 * @author datacharm.cn
 */
public class FiredChicken extends Step {
    @Override
    void food() {
        System.out.println("准备鸡排...");
    }

    @Override
    void oil() {
        System.out.println("倒油...");
    }

    @Override
    void spices() {
        System.out.println("下调料...");
    }

    @Override
    void fill() {
        System.out.println("装进盘子...");
    }
}
