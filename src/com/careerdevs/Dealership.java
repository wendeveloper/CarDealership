package com.careerdevs;

import java.sql.SQLOutput;
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

    public boolean displayInventoryReserved() {  // method print out car inventory reserved to console
        System.out.println("Reserved cars:");
        if (currentCarsBooked.size() == 0) {
            System.out.println("No reserved cars to return at this time");
            return false;
        } else {

            for (int i = 0; i < currentCarsBooked.size(); i++) {
                System.out.println(currentCarsBooked.get(i).toString());
            }
            return true;
        }
    }

    public boolean displayInventory() {  // method print out car inventory to console
        System.out.println("Available cars:");
        if (currentCarsAvailable.size() == 0){
//            System.out.println("No available cars to reserve at this time.");
            return false;
        } else {
            for (int i = 0; i < currentCarsAvailable.size(); i++) {
                System.out.println(currentCarsAvailable.get(i).toString());
            }
            return true;
        }
    }


    public boolean reserveCar(String carMake) {
        boolean confirmReservation = false;
        for (int i = 0; i < currentCarsAvailable.size(); i++) {

            if(currentCarsAvailable.get(i).getMake().equals(carMake)) {
                currentCarsBooked.add(currentCarsAvailable.get(i));
                currentCarsAvailable.remove(i);
                confirmReservation = true;
            }
        }
        return confirmReservation;
    }



    public boolean returnCar(String carMake) {
        boolean confirmReturn = false;
        for (int i = 0; i < currentCarsBooked.size(); i++) {

            if(currentCarsBooked.get(i).getMake().equals(carMake)) {
                currentCarsAvailable.add(currentCarsBooked.get(i));
                currentCarsBooked.remove(i);
                confirmReturn = true;
            }
        }
        return confirmReturn;
    }
}
