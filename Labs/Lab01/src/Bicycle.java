// Q3

import java.util.Scanner;

public class Bicycle {
        Scanner scanner = new Scanner(System.in);

        private int speed;
        private String maker;
        private String type;

        public Bicycle(int s, String m, String t) {
            this.speed = s;
            this.maker = m;
            this.type = t;
        }

       /** public int getDetails() {

            int speed = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Enter make: ");
            String maker = scanner.next();
            System.out.println("Enter type: ");
            String type = scanner.next();

            return speed;
        }
        */

        public void Go() {
            System.out.println("I am going as fast as I can!\n");
        }

        public void Go(int s) {
            System.out.println("I am going at " + s + " pedals per minute!");
        }

        public String toString() {
            return speed + " " + maker + " " + type + " ";
        }

        // public String print() {
        //    System.out.print();
}



