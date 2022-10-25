// Q3

import java.util.Scanner;
import java.util.ArrayList;

public class TestCarPartc {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Car> myCarFleet = new ArrayList<>();

        int option;

        do {
            System.out.println("~~~~~~~~ MENU ~~~~~~~~\n" +
                                "1. Add car\n" +
                                "2. Remove car\n" +
                                "3. Show car fleet");

            option = scan.nextInt();
            
            switch (option) {

                case 1:
                    //option = 1;                                                 // Add a car to the list

                    System.out.println("Enter make: ");
                    String make = scan.next();

                    System.out.println("Enter model: ");
                    String model = scan.next();

                    System.out.println("Enter price: ");
                    String price = scan.next();

                    System.out.println("Enter year: ");
                    int year = scan.nextInt();

                    Car myCar = new Car(make, model, year, price);

                    myCarFleet.add(myCar);
                    break;

                case 2:
                    //option = 2;                                                 // Remove a car from the list

                    System.out.println("Enter car to remove: ");
                    int index = scan.nextInt() - 1;

                    myCarFleet.remove(0);
                    break;

                case 3:
                    //option = 3;                                                 // Display the list of cars

                    for (Car x : myCarFleet) {
                        x.printDetails();
                    }
                    break;
            }
        }
            while (option != 'x');
    }
}

// Question: What are the advantages of using an ArrayList over an array?
    // Arrays are a *static* data structure, meaning they are fixed in length.
    // You must specify their size when creating one.
    // ArrayLists are a *dynamic* data structure, meaning they can grow and shrink depending on what is needed.
    // You do not need to specify their size when creating one (set to 10 by default).
