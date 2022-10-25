// Q2

import java.util.Scanner;

public class Cars {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;

        String[] make = new String[2];
        String[] model = new String[2];
        int[] year = new int[2];
        String[] price = new String[2];
        int carAge;

        do {
            System.out.println("Enter make: ");
            make[i] = scanner.next();

            System.out.println("Enter model: ");
            model[i] = scanner.next();

            System.out.println("Enter year of manufacture: ");
            year[i] = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter car price: ");
            price[i] = scanner.next();
            i++;
        } while (i < make.length);

        for (int x = 0; x < make.length; x++) {

            carAge = (2018 - year[x]);

            String status;

            // 1-3      shiny new
            // 6        slightly worn
            // 6-8      past its best
            // 8-10     showing signs of age
            // 10+      banger

            if (carAge <= 3) {
                status = "shiny new";
            } else if (carAge == 6) {
                status = "slightly worn";
            } else if (carAge >= 6 && carAge <= 8) {
                status = "past its best";
            } else if (carAge >=8 && carAge <= 10) {
                status = "showing signs of age";
            } else {
                status = "a banger";
            }
            System.out.println(make[x] + model[x] + " is " + carAge + " years old, and is " + status + ".");
        }
    }
}