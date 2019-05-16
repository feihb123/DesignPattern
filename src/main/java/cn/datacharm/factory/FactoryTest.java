package cn.datacharm.factory;

public class FactoryTest {
    public static void main(String[] args) {
        System.out.println("Factory:");
        ICar lowcar = CarSimpleFactory.create("LowCar");
        lowcar.run();
        ICar midcar = CarSimpleFactory.create("MidCar");
        midcar.run();
        ICar upcar = CarSimpleFactory.create("UpCar");
        upcar.run();

    }
}
