package com.movie.movie.car;

import com.movie.movie.model.OfferDetails;

public interface Car extends Specification {
     OfferDetails offer(Car abstractCar);
}
