package cn.datacharm.factory;

public class CarSimpleFactory {

    public static ICar create(String car){
        if("LowCar".equals(car)){
            return new LowCar();
        }if("MidCar".equals(car)){
            return new MidCar();
        }if("UpCar".equals(car)){
            return new UpCar();
        }else{
            return null;
        }
    }

}
