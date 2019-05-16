package cn.datacharm.builder;

import org.junit.Test;

public class KFCMealTest {

    @Test
    public void kfcMeal(){
        MealBuilder ma=new MealBuildA();
        KFCWaiter waiter=new KFCWaiter(ma);
        Meal meal=waiter.buildMeal();
        meal.show();
    }
}
