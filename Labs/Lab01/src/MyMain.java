public class MyMain {
    public static void main (String[] args) {
        Bicycle bike1 = new Bicycle(180, "BMW", "road");
        Bicycle bike2 = new Bicycle(70, "Harley Davidson", "road");
        Bicycle bike3 = new Bicycle(200, "Yeti", "mountain");

        bike1.Go(12);
        bike1.Go();

        bike2.Go(90);
        bike2.Go();

        bike3.Go(200);
        bike3.Go();

        bike1.toString();
        System.out.println("Bike 1: " + bike1);

        bike2.toString();
        System.out.println("Bike 2: " + bike2);

        bike3.toString();
        System.out.println("Bike 3: " + bike3);
    }
}
