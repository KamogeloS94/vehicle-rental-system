// src/main/java/za/co/protogen/domain/Car.java
package za.co.protogen.domain;

import java.util.List;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private String engine;
    private Transmission transmission;
    private FuelType fuelType;
    private int mileage;
    private String vin;
    private double price;
    private int ownerId;
    private List<String> features;

    public enum Transmission { MANUAL, AUTOMATIC, CVT }
    public enum FuelType { GASOLINE, DIESEL, ELECTRIC }

    // Getters and Setters
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getEngine() { return engine; }
    public void setEngine(String engine) { this.engine = engine; }

    public Transmission getTransmission() { return transmission; }
    public void setTransmission(Transmission transmission) { this.transmission = transmission; }

    public FuelType getFuelType() { return fuelType; }
    public void setFuelType(FuelType fuelType) { this.fuelType = fuelType; }

    public int getMileage() { return mileage; }
    public void setMileage(int mileage) { this.mileage = mileage; }

    public String getVin() { return vin; }
    public void setVin(String vin) { this.vin = vin; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getOwnerId() { return ownerId; }
    public void setOwnerId(int ownerId) { this.ownerId = ownerId; }

    public List<String> getFeatures() { return features; }
    public void setFeatures(List<String> features) { this.features = features; }

    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", year=" + year + "]";
    }
}
