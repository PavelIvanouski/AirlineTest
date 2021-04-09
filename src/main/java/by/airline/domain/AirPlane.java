package by.airline.domain;

import by.airline.enums.Brand;
import by.airline.util.PlaneUtil;

import java.util.Objects;

public abstract class AirPlane implements Flyable, Comparable<AirPlane> {

    private Brand brand;
    private int carryingСapacity;
    private int peopleCapacity;
    private Integer flyingRange;
    private int fuelConsumption;

    public AirPlane(Brand brand, int carryingСapacity, int peopleCapacity, Integer flyingRange, int fuelConsumption) {
        this.brand = brand;
        this.carryingСapacity = carryingСapacity;
        this.peopleCapacity = peopleCapacity;
        this.flyingRange = flyingRange;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void toTakeOff() {
        PlaneUtil.startTheEngine();
        boolean permission = PlaneUtil.getPermission();
        PlaneUtil.takeOff(permission);
        PlaneUtil.chassisUp();
    }

    @Override
    public void toFly() {
        PlaneUtil.useTheNavigator(12, 10);
    }

    @Override
    public void toLand() {
        PlaneUtil.chassisDown();
        PlaneUtil.TurnOffTheEngine();
    }

    //region getters/setters
    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getCarryingСapacity() {
        return carryingСapacity;
    }

    public void setCarryingСapacity(int carryingСapacity) {
        this.carryingСapacity = carryingСapacity;
    }

    public int getPeopleCapacity() {
        return peopleCapacity;
    }

    public void setPeopleCapacity(int peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }

    public Integer getFlyingRange() {
        return flyingRange;
    }

    public void setFlyingRange(Integer flyingRange) {
        this.flyingRange = flyingRange;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    //endregion


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirPlane airPlane = (AirPlane) o;
        return (carryingСapacity == airPlane.carryingСapacity)
                && (peopleCapacity == airPlane.peopleCapacity)
                && (flyingRange == airPlane.flyingRange)
                && (fuelConsumption == airPlane.fuelConsumption)
                && (brand == airPlane.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, carryingСapacity, peopleCapacity, flyingRange, fuelConsumption);
    }

    @Override
    public int compareTo(AirPlane o) {
        int result = this.flyingRange.compareTo(o.flyingRange);
        return result;
    }

    @Override
    public String toString() {
        return "AirPlane: " +
                "brand= " + brand +
                ", carrying capacity= " + carryingСapacity +
                " tn, people capacity= " + peopleCapacity +
                " pers., flying range= " + flyingRange +
                " km, fuel consumption= " + fuelConsumption + " L./1000 km";
    }
}
