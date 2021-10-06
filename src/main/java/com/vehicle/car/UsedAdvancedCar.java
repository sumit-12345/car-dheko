package com.vehicle.car;

import com.vehicle.model.CustomerDetails;
import com.vehicle.model.Invoice;

public class UsedAdvancedCar extends AbstractUsedAdvancedCar {

    @Override
    public Invoice sellCar(CustomerDetails customerDetails) {
        System.out.println("UsedAdvacedCar at "+sellingPrice+ " from "+owner);
        return new Invoice();
    }

    @Override
    public boolean homeDelevery(CustomerDetails customerDetails) {
        System.out.println("car bought by "+customerDetails.getName());
        return new Invoice().isHomeDeliveryAvailable();
    }
}
