package cn.datacharm.statepattern.hotel;

import java.util.ArrayList;
import java.util.List;

/**
 * 楼层
 * @author datacharm.cn
 */
public class Floor {
    List<Room> rooms;

    public Floor() {
        rooms = new ArrayList<>();
    }

    public void add(Room room){
        rooms.add(room);
    }

    public void remove(Room room){
        rooms.remove(room);
    }

    public void show(){
        System.out.print("当前楼层房间：");
        for (Room room : rooms) {
            room.show();
            System.out.print("   ");
        }
    }
}
