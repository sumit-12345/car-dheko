package com.vehicle.CarStorage;

import com.vehicle.car.Specification;

import java.util.Arrays;

/**
 *  CarStorage is Singleton Calss.
 * @author  Pratik_Panda
 */
/*

 */
public class CarStorage {
    private Specification[] cars;
    private static CarStorage carStorage;
    private  int counter = 0;
    private CarStorage() {
        this.cars = new Specification[10];
    }

    /**
     * @return
     */
    public static CarStorage getCarStorage() {
        if (carStorage == null)
            carStorage = new CarStorage();
        return carStorage;
    }

    /**
     * @param car
     * @return
     */
    public boolean save(Specification car) {
        if(this.counter>=cars.length-1)
            this.grow();
        cars[counter++] =  car;
        return  true;
    }

    /**
     *
     */
    private void grow() {
        int oldLength = cars.length;
        int newLength = oldLength + (oldLength/2);
        Specification[] newCars = new Specification[newLength];
        for (int i=0;i<oldLength;i++)
            newCars[i] = cars[i];
        cars = null;
        cars = newCars;
    }

    public Specification[] getCars() {
        return this.cars;
    }
}
