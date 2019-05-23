package cn.datacharm.template;

/**
 * @author datacharm.cn
 */
public class Chips extends Step {
    @Override
    void food() {
        System.out.println("准备薯条...");
    }

    @Override
    void oil() {
        System.out.println("倒很多油...");
    }

    @Override
    void spices() {
        System.out.println("下薯条调料...");
    }

    @Override
    void fill() {
        System.out.println("把薯条装进盘子...");
    }
}
