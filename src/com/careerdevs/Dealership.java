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

    public String bookCar(String carMake){
        for (int i = 0; i < getCurrentCarsAvailable().size(); i++) {
            if(getCurrentCarsAvailable().get(i).getMake().equals(carMake)) {
                getCurrentCarsBooked().add(getCurrentCarsAvailable().get(i));
                getCurrentCarsAvailable().remove(i);
            }

        }
        return carMake;
//        System.out.println("booked " + getCurrentCarsBooked().toString());
//        System.out.println("available " + getCurrentCarsAvailable().toString());
    }

}
