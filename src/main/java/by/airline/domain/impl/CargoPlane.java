package by.airline.domain.impl;

import by.airline.domain.AirPlane;
import by.airline.enums.Brand;

public class CargoPlane extends AirPlane implements Comparable<AirPlane>{
    private float trapdoorHeight;
    private float trapdoorWidth;

    public CargoPlane(Brand brand, int carryingСapacity, int peopleCapacity, Integer flyingRange,
                      int fuelConsumption, float trapdoorHeight, float trapdoorWidth) {
        super(brand, carryingСapacity, peopleCapacity, flyingRange, fuelConsumption);
        this.trapdoorHeight = trapdoorHeight;
        this.trapdoorWidth = trapdoorWidth;
    }

    @Override
    public void toFly() {
        //checkTheTrapdoor();
        super.toFly();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", trapdoor height= " + trapdoorHeight +
                " m, trapdoor width= " + trapdoorWidth + " m";
    }
}
