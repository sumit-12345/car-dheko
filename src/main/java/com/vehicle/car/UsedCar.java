package com.movie.movie.car;

import com.movie.movie.model.CustomerDetails;
import com.movie.movie.model.Invoice;

public interface UsedCar {
    Invoice sellCar(CustomerDetails customerDetails);

    boolean homeDelevery(CustomerDetails customerDetails);
}
