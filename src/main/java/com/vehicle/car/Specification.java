package com.vehicle.car;
import com.vehicle.model.CustomerDetails;
import com.vehicle.model.InsurenceDetails;
import com.vehicle.model.Invoice;
import com.vehicle.model.LoanDetails;


public interface Specification {
    Invoice buy(CustomerDetails customerDetails, Specification specification);
    Invoice book(CustomerDetails customerDetails,Specification specification);
    LoanDetails loan(Specification specification);
    InsurenceDetails insurence(Specification specification);
    void compare(Specification car1,Specification car2);
    void emi(Specification car);
    String getBrand();
    String getName();

}
