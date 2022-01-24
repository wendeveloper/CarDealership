package com.careerdevs;

// create Car class
public class Car {

    // fields declared
    public String make;
    public String model;
    public int mileage;
    public float gasTankPercent;

    // constructor for Car class
    public Car( String make, String model, int mileage, float gasTankPercent ) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.gasTankPercent = gasTankPercent;
    }

    //getters and setters methods for Car properties
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getGasTankPercent() {
        return gasTankPercent;
    }

    public void setGasTankPercent(float gasTankPercent) {
        this.gasTankPercent = gasTankPercent;
    }

    // this will return a string version
    @Override
    public String toString() {
        return "    CAR MAKE: " + this.make
                + "    MODEL: " + this.model
                + "    MILEAGE: " + this.mileage
                + "    FUEL: " + this.gasTankPercent + "%";

    }
}
