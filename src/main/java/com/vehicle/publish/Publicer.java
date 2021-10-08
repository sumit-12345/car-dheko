package com.vehicle.publish;

import com.vehicle.CarStorage.CarStorage;
import com.vehicle.car.Specification;

/**
 * @author Sribachha_Thakur
 */
public class Publicer {
    private CarStorage carStorage = null;
    public Publicer() {
        this.carStorage = CarStorage.getCarStorage();
    }
    public void publishCar(Specification car) {
        this.carStorage.save(car);
    }
}
