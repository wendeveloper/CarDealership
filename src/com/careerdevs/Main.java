package com.careerdevs;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

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

        System.out.println("\r\n ====== Welcome to Car Dealer Wendy ========");
        System.out.println("Enter (1) to book a car, (2) to return a car, or (3) to exit the dealership");

        int custInput = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        String carMake;
        while(custInput <= 3) {     //execute the code if this is true

            switch (custInput) {
                case 1:  // reserve car
                    System.out.println("Enter car make to reserve");
                    carMake = scanner.nextLine();
//                  carDealerWendy.reserveCar(carMake);
                    System.out.println("RESERVED: " + carDealerWendy.reserveCar(carMake));
                    System.out.println("Reserved List: " + carDealerWendy.getCurrentCarsBooked());
                    System.out.println("Available List: " + carDealerWendy.getCurrentCarsAvailable().toString());
                    break;

                case 2:  // return car
                    System.out.println("Enter car make to return");
                    carMake = scanner.nextLine();
                    System.out.println("RETURNED: " + carDealerWendy.returnCar(carMake));
                    System.out.println("Reserved List: " + carDealerWendy.getCurrentCarsBooked());
                    System.out.println("Available List: " + carDealerWendy.getCurrentCarsAvailable().toString());
                    break;

                case 3:
                    System.out.println("Exiting Car Dealer Wendy Application.  Bye-bye.");
                    break;
            }

            if (custInput == 3) {   // exit the application
                break;
            } else {    // prompt customer
                System.out.println("Enter (1) to book a car, (2) to return a car, or (3) to exit the dealership");
                custInput = scanner.nextInt();
                scanner.nextLine();  // Consume newline left-over
            }
        }



//        String carToBook = scanner.nextLine();
//        carDealerWendy.bookCar(carToBook);
//        System.out.println("You reserved: " + carDealerWendy.bookCar(carToBook));
//        System.out.println("booked " + carDealerWendy.getCurrentCarsBooked());
//        System.out.println("available " + carDealerWendy.getCurrentCarsAvailable().toString());
    }
}
