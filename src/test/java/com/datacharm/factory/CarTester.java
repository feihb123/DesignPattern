package com.datacharm.factory;

import org.junit.Test;

public class CarTester {
    @Test
    public void testFactory(){
        ICar lowCar = CarSimpleFactory.create("LowCar");
        lowCar.run();
    }
}
