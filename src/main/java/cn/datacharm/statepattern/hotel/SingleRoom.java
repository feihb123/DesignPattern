package cn.datacharm.statepattern.hotel;

/**
 * 单人间
 * @author datacharm.cn
 */
public class SingleRoom extends Room {

    public SingleRoom() {
        super();
        this.name = "单人间";
        //默认为圆形，（后期可改变）
        this.shape = new Circle();
    }



    @Override
    public void show() {
        this.shape.show();
        this.state.show();
    }
}
