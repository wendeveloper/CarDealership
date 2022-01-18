package com.careerdevs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // create 3 instances of Car class
        Car car1 = new Car("Toyota", "Camry", 40000, 50);
        Car car2 = new Car("Volvo", "Momentum", 25000, 90);
        Car car3 = new Car("Subaru", "Outback", 1000, 100);

        // create instance of Dealership class called carDealerWendy
        Dealership carDealerWendy = new Dealership("Car Dealer Wendy");

        // add available cars to carDealerWendy instance of Dealership
        carDealerWendy.getCurrentCarsAvailable().add(car1);
        carDealerWendy.getCurrentCarsAvailable().add(car2);
        carDealerWendy.getCurrentCarsAvailable().add(car3);

        // call the displayInventory method
        carDealerWendy.displayInventory();

        System.out.println("Enter make of car to book:");
        Scanner scanner = new Scanner(System.in);
        String carToBook = scanner.nextLine();
        carDealerWendy.bookCar(carToBook);
        System.out.println("You reserved: " + carDealerWendy.bookCar(carToBook));
        System.out.println("booked " + carDealerWendy.getCurrentCarsBooked());
        System.out.println("available " + carDealerWendy.getCurrentCarsAvailable().toString());
    }
}
