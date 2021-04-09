package by.airline.domain.impl;

import by.airline.domain.AirPlane;
import by.airline.enums.Brand;
import by.airline.enums.SeatsClass;

public class PassengerPlane extends AirPlane implements Comparable<AirPlane>{
    private SeatsClass seatsClass;

    public PassengerPlane(Brand brand, int carryingСapacity, int peopleCapacity, Integer flyingRange,
                          int fuelConsumption, SeatsClass seatsClass) {
        super(brand, carryingСapacity, peopleCapacity, flyingRange, fuelConsumption);
        this.seatsClass = seatsClass;
    }

    @Override
    public void toTakeOff() {
        //instructPassengers();
        super.toTakeOff();
    }

    @Override
    public void toLand() {
        //warnPassengers();
        super.toLand();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", seats class= " + seatsClass;
    }
}
