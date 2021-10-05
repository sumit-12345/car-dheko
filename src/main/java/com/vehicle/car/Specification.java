package com.movie.movie.car;

import com.movie.movie.model.CustomerDetails;
import com.movie.movie.model.InsurenceDetails;
import com.movie.movie.model.Invoice;
import com.movie.movie.model.LoanDetails;
import lombok.Data;


public interface Specification {
    Invoice buy(CustomerDetails customerDetails,Specification specification);
    Invoice book(CustomerDetails customerDetails,Specification specification);
    LoanDetails loan(Specification specification);
    InsurenceDetails insurence(Specification specification);
    void compare(Specification car1,Specification car2);
    void emi(Specification car);
    String getBrand();
    String getName();
}
