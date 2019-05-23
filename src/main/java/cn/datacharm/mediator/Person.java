package cn.datacharm.mediator;

public abstract class Person {
    String name;
    Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void contract(String message);
    public abstract void getMessage(String message);
}
