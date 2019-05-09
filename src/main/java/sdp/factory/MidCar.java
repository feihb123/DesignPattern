package sdp.factory;

public class MidCar implements ICar {
    public String getType() {
        return "MidCar";
    }

    public void run() {
        System.out.println("MidCar run!");
    }
}
