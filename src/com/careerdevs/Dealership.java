package com.careerdevs;

import java.util.ArrayList;

public class Dealership {

    // fields declared
    private String dealershipName;
    private ArrayList<Car> currentCarsAvailable;
    private ArrayList<Car> currentCarsBooked;


    // constructor for Dealership class
    public Dealership( String dealershipName) {
        this.dealershipName = dealershipName;
        this.currentCarsAvailable = new ArrayList<>();
        this.currentCarsBooked = new ArrayList<>();
    }


    // getters and setters for dealership properties
    public String getDealershipName() {
        return dealershipName;
    }

    public void setDealershipName(String dealershipName) {
        this.dealershipName = dealershipName;
    }

    public ArrayList<Car> getCurrentCarsAvailable() {
        return currentCarsAvailable;
    }

    public void setCurrentCarsAvailable(ArrayList<Car> currentCarsAvailable) {
        this.currentCarsAvailable = currentCarsAvailable;
    }

    public ArrayList<Car> getCurrentCarsBooked() {
        return currentCarsBooked;
    }

    public void setCurrentCarsBooked(ArrayList<Car> currentCarsBooked) {
        this.currentCarsBooked = currentCarsBooked;
    }

    public void displayInventory() {  // method print out car inventory to console
        for (int i = 0; i < currentCarsAvailable.size(); i++) {
                System.out.println(currentCarsAvailable.get(i).toString());
        }
    }

    public String reserveCar(String carMake){
        for (int i = 0; i < currentCarsAvailable.size(); i++) {
            if(currentCarsAvailable.get(i).getMake().equals(carMake)) {
                currentCarsBooked.add(currentCarsAvailable.get(i));
                currentCarsAvailable.remove(i);
            }
        }
        return carMake;
    }

    public String returnCar(String carMake) {
        for (int i = 0; i < currentCarsBooked.size(); i++) {
            if(currentCarsBooked.get(i).getMake().equals(carMake)) {
                currentCarsAvailable.add(currentCarsBooked.get(i));
                currentCarsBooked.remove(i);
            }
        }
        return carMake;
    }
}
