package com.vehicle.car;

import com.vehicle.model.CustomerDetails;
import com.vehicle.model.Invoice;

public interface UsedCar {
    Invoice sellCar(CustomerDetails customerDetails);

    boolean homeDelevery(CustomerDetails customerDetails);
}
