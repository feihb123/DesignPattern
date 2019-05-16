package cn.datacharm.builder;

public class MealBuildB extends MealBuilder {
    @Override
    public void buildHam() {
        meal.ham="牛肉汉堡";
    }

    @Override
    public void buildCola() {
        meal.cola="百世可乐";
    }

    @Override
    public void buildChicken() {
        meal.chicken="鸡肉炸鸡";
    }

    @Override
    public void buildChips() {
        meal.chips="大薯条";
    }
}
