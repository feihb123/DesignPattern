package cn.datacharm.statepattern.state_pattern_hotel;

/**
 * 仅用来显示关系  具体在Frame内部类
 */
public class Room implements HotelFrame.State {
    HotelFrame.State state ;

    public Room(HotelFrame.State state) {
        this.state = state;
    }

    public Room() {
    }

    public HotelFrame.State getState() {
        return state;
    }

    public void setState(HotelFrame.State state) {
        this.state = state;
    }

    @Override
    public void handle() {

    }
}
