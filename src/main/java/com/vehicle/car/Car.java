package com.vehicle.car;

import com.vehicle.model.OfferDetails;

public interface Car extends Specification {
     OfferDetails offer(Car abstractCar);
}
