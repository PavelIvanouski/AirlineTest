package by.airline.enums;

public enum SeatsClass {
    ECONOMY("Economy"),
    BUSINESS("Business"),
    FIRST("First");
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    SeatsClass(String name) {
        this.name = name;
    }
}
