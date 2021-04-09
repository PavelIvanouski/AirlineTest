package by.airline.enums;

public enum Brand {
    AIRBUS("Airbus"),
    BOEING("Boeing"),
    KUKURUZNIK("Kukuruznik"),
    SU("Su-30MKI"),
    MIG("Mig-35");

    private String name;

    Brand(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
