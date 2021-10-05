package com.vehicle.car;

import com.vehicle.model.CustomerDetails;
import com.vehicle.model.Invoice;

public class UsedBasic extends AbstractUsedBasic{

    @Override
    public Invoice sellCar(CustomerDetails customerDetails) {
        return null;
    }

    @Override
    public boolean homeDelevery(CustomerDetails customerDetails) {
        return false;
    }
}
