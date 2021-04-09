package by.airline.domain.impl;

import by.airline.domain.AirPlane;
import by.airline.enums.Brand;

public class MilitaryPlane extends AirPlane implements Comparable<AirPlane>{
    private int rocketCount;

    public MilitaryPlane(Brand brand, int carryingСapacity, int peopleCapacity, Integer flyingRange,
                         int fuelConsumption, int rocketCount) {
        super(brand, carryingСapacity, peopleCapacity, flyingRange, fuelConsumption);
        this.rocketCount = rocketCount;
    }

    @Override
    public void toTakeOff() {
        //getOrder();
        super.toTakeOff();
    }

    @Override
    public void toLand() {
        //getOrder();
        //report();
        super.toLand();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", rocket count= " + rocketCount;
    }
}
