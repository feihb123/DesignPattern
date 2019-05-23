package cn.datacharm.template;

public abstract class Step {
    public final void cook(){
        food();
        oil();
        spices();
        fill();
    }

    abstract void food();
    abstract void oil();
    abstract void spices();
    abstract void fill();
}
