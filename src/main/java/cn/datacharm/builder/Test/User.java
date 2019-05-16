package cn.datacharm.builder.Test;

public class User {
    MealBuilder mealBuilder;

    public User(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal getMeal(){
        mealBuilder.build();
        return mealBuilder.getMeal();
    }

    public static void main(String[] args) {
        MealBuilder mealBuilder = new BuilderA();
        User user = new User(mealBuilder);
        Meal meal =user.getMeal();
        System.out.println(meal.toString());
    }
}
