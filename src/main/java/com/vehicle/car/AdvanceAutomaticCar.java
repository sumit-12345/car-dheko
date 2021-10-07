package com.vehicle.car;

import com.vehicle.model.*;

public class AdvanceAutomaticCar extends AbstractAdvanceAutomaticCar {

    @Override
    public OfferDetails offer(Car abstractCar) {
        return null;
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
