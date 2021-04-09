package by.airline.app;

import by.airline.domain.AirPlane;
import by.airline.domain.impl.CargoPlane;
import by.airline.domain.impl.MilitaryPlane;
import by.airline.domain.impl.PassengerPlane;
import by.airline.enums.Brand;
import by.airline.enums.SeatsClass;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        PassengerPlane passengerPlane1 = new PassengerPlane(Brand.AIRBUS, 10000, 500,
                20000, 100, SeatsClass.BUSINESS);
        PassengerPlane passengerPlane2 = new PassengerPlane(Brand.BOEING, 15000, 700,
                10000, 100, SeatsClass.ECONOMY);
        MilitaryPlane militaryPlane = new MilitaryPlane(Brand.MIG, 5000, 1,
                30000, 500, 8);
        CargoPlane cargoPlane = new CargoPlane(Brand.AIRBUS, 30000, 3,
                50000, 300, 5, 3.70f);

        List<AirPlane> airlineList = new ArrayList<>();
        airlineList.add(passengerPlane1);
        airlineList.add(passengerPlane2);
        airlineList.add(militaryPlane);
        airlineList.add(cargoPlane);

        int totalCarryingСapacity = 0;
        int totalPeopleCapacity = 0;
        for (AirPlane plane : airlineList) {
            totalCarryingСapacity += plane.getCarryingСapacity();
            totalPeopleCapacity += plane.getPeopleCapacity();
        }
        System.out.println("Total carrying capacity = " + totalCarryingСapacity + " tn.");
        System.out.println("Total people capacity = " + totalPeopleCapacity + " pers.");

        System.out.println("Sorted planes by flying range:");
        airlineList.stream().sorted().forEach(System.out::println);
        System.out.println("Filtered planes by fuel consumption:");
        airlineList.stream()
                .filter((airPlane -> airPlane.getFuelConsumption() > 200 && airPlane.getFuelConsumption() < 600))
                .forEach(System.out::println);


    }
}
