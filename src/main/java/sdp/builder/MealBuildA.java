package sdp.builder;

public class MealBuildA extends MealBuilder {
    @Override
    public void buildHam() {
        meal.ham="芝士汉堡";
    }

    @Override
    public void buildCola() {
        meal.cola="可口可乐";
    }

    @Override
    public void buildChicken() {
        meal.chicken="炸鸡";
    }

    @Override
    public void buildChips() {
        meal.chips="中薯条";
    }
}
