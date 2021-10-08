package com.vehicle.consumer;

import com.vehicle.CarStorage.CarStorage;
import com.vehicle.car.Specification;
import com.vehicle.car.UsedCar;
import com.vehicle.car.UsedManualCar;
import com.vehicle.util.CarType;

import java.util.Arrays;

/**
 * @author Sambit_Joshi
 */
public class CarConsumer {
    private CarStorage carStorage;
    public CarConsumer() {
        this.carStorage= CarStorage.getCarStorage();
    }


    public UsedCar[] getAllOldCars(CarType carType) {
        Specification[] cars = this.carStorage.getCars();
        UsedCar[] usedCars = new UsedCar[100];
        int count=0;
        for (int i=0;i<cars.length&&cars[i]!=null;i++){
                if (cars[i].getClass().getSimpleName().equalsIgnoreCase(carType.name())){
                    usedCars[count++] = (UsedManualCar)cars[i];
                }
        }

        Arrays.copyOf(usedCars,count);
        return usedCars;
    }
}
