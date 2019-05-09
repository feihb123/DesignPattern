package sdp.builder.Test;

public class BuilderA extends MealBuilder{
    @Override
    public void build() {
        meal = new Meal("meal","10");
    }
}
