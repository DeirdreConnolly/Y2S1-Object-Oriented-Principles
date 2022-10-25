// Q1

import java.util.Scanner;

public class Bottles {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 99;
        System.out.print("Enter an integer: ");
        i = scan.nextInt();
        System.out.println();

        do {
            if (i == 1) {
                System.out.println(i + " bottle of beer on the wall\n");
                System.out.println(i + " bottle of beer");
            }
            else {
                System.out.println(i + " bottles of beer on the wall\n");
                System.out.println(i + " bottles of beer");
            }
            System.out.println("Take 1 down");
            System.out.println("Pass it around");
            i--;
        } while (i != 0);
        System.out.println("No more bottles of beer on the wall");
    }
}