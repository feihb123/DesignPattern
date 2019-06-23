package cn.datacharm.statepattern.hotel;

/**
 * 标准间
 * @author datacharm.cn
 */
public class StandardRoom extends Room {

    public StandardRoom() {
        super();
        this.name = "标准间";
        //默认为正方形，（后期可改变）
        this.shape = new Square();
    }

    @Override
    public void show() {
        this.shape.show();
        this.state.show();
    }
}
