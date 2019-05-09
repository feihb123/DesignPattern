package sdp.builder;

public abstract class MealBuilder {
    Meal meal = new Meal();
    public abstract void buildHam();
    public abstract void buildCola();
    public abstract void buildChicken();
    public abstract void buildChips();

    public Meal getResult(){
        return meal;
    }
}
