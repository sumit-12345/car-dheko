package com.vehicle.car;

import com.vehicle.model.CustomerDetails;
import com.vehicle.model.InsurenceDetails;
import com.vehicle.model.Invoice;
import com.vehicle.model.LoanDetails;

public  class UsedAdvancedCar extends AbstractUsedAdvancedCar {

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

    @Override
    public Invoice buy(CustomerDetails customerDetails, Specification specification) {
        return null;
    }

    @Override
    public Invoice book(CustomerDetails customerDetails, Specification specification) {
        return null;
    }

    @Override
    public LoanDetails loan(Specification specification) {
        return null;
    }

    @Override
    public InsurenceDetails insurence(Specification specification) {
        return null;
    }

    @Override
    public void compare(Specification car1, Specification car2) {

    }

    @Override
    public void emi(Specification car) {

    }

    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
