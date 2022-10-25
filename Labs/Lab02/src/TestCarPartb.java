// Q3

import java.util.*;

public class TestCarPartb {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int arrayLength;

            System.out.println("Number of cars: ");

            arrayLength = scan.nextInt();

        Car[] myCars = new Car[arrayLength];

        for (int i = 0; i < arrayLength; i++) {

            System.out.println("Enter make: ");
            String make = scan.next();

            System.out.println("Enter model: ");
            String model = scan.next();

            System.out.println("Enter price: ");
            String price = scan.next();

            System.out.println("Enter year: ");
            int year = scan.nextInt();

            Car myCar = new Car(make, model, year, price);
            myCars[i] = myCar;
        }

        for (int i = 0; i < arrayLength; i++) {
            myCars[i].printDetails();
        }

        scan.close();
    }
}


// should have used toString method??