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

        System.out.println("\r\n ====== Welcome to Car Dealer Wendy ======== \r\n");
        System.out.println("Enter: \n (1) to book a car \n (2) to return a car \n (3) to exit the dealership");


        int custInput = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        String custCarMakeToReserve;
        String custCarMakeToReturn;
        while(custInput <= 3 && custInput > 0) {     //execute the code if this is true

            switch (custInput) {

                case 1:  // reserve car

                    if (carDealerWendy.displayInventory()) {  // if inventory exists
                        System.out.println("Enter car make to RESERVE");
                        custCarMakeToReserve = scanner.nextLine();

                        // *** check if carMake is available.
                        if (carDealerWendy.reserveCar(custCarMakeToReserve)) {
                            // *** reserve the car
                            System.out.println("\r\n ====== A " + custCarMakeToReserve + " is now reserved for you. ======== \r\n");
                        } else {
                            System.out.println(custCarMakeToReserve + " is not available at this time.\r");
                        }
                    }
                    break;


                case 2:  // return car

                    //System.out.println("Cars Reserved: " + carDealerWendy.getCurrentCarsBooked());
                    if (carDealerWendy.displayInventoryReserved()) {  // if reserved inventory exists
                        System.out.println("Enter car make to RETURN");
                        custCarMakeToReturn = scanner.nextLine();

                        // ** check if carMake is in the reserved list of cars.
                        if (carDealerWendy.returnCar(custCarMakeToReturn)) {
                            // *** return the car
                            System.out.println("\r\n ====== A " + custCarMakeToReturn + " has been returned by you. ======== \r\n");
                        } else {
                            System.out.println(custCarMakeToReturn = " is not in our records. \r");
                        }
                    }
                    break;


                case 3:
                    System.out.println("Exiting Car Dealer Wendy Application.  Bye-bye.");
                    break;


            }

            if (custInput == 3) {   // exit the application
                break;
            } else {    // prompt customer
                System.out.println("Enter: \n (1) to book a car \n (2) to return a car \n (3) to exit the dealership");
                custInput = scanner.nextInt();
                scanner.nextLine();  // Consume newline left-over
            }
        }

    }
}
