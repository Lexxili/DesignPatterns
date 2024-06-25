package de.abraun.builder;

public class Vehicle {

    private final String brand, type, registration;

    public Vehicle(String brand, String type, String registration) {
        this.brand = brand;
        this.type = type;
        this.registration = registration;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public String getRegistration() {
        return registration;
    }
}
