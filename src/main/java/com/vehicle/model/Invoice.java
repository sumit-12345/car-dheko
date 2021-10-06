package com.vehicle.model;

import com.vehicle.car.Specification;

public class Invoice {

    String name ;
    boolean homeDeliveryAvailable ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHomeDeliveryAvailable() {
        return homeDeliveryAvailable;
    }

    public void setHomeDeliveryAvailable(boolean homeDeliveryAvailable) {
        this.homeDeliveryAvailable = homeDeliveryAvailable;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "name='" + name + '\'' +
                ", homeDeliveryAvailable=" + homeDeliveryAvailable +
                '}';
    }


}
