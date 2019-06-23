package cn.datacharm.statepattern.hotel;

/**
 * 三人间
 * @author datacharm.cn
 */
public class ThreeRoom extends Room {

    public ThreeRoom() {
        super();
        this.name = "三人间";
        //默认为三角形，（后期可改变）
        this.shape = new Triangle();
    }

    @Override
    public void show() {
        this.shape.show();
        this.state.show();
    }
}
