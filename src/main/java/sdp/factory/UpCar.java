package sdp.factory;

public class UpCar implements ICar {
    public String getType() {
        return "UpCar";
    }

    public void run() {
        System.out.println("UpCar run!");
    }
}
