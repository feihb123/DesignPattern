package cn.datacharm.statepattern.hotel;

/**
 * 抽象房间类
 * @author datacharm.cn
 */
public abstract class Room {
    String name;
    Shape shape;
    State state;

    public Room() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public abstract void show();

}
