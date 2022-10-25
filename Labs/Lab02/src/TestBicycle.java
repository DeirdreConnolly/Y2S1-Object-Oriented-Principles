// Q1

public class TestBicycle {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();                  // creating a new object called Bicycle
        bike1.setSpeed(100);                            // use setters and getters
        bike1.setMaker("Raleigh");
        bike1.setType("Mountain Bike");
        //bike1.print();
        System.out.println(bike1);                      // prints the details of the object Bicycle

        Bicycle bike2 = new Bicycle(10, "Home Made", "Bone Shaker");
        //print();
        System.out.println(bike2);                      // prints the details of Bicycle bike2
    }
}

// UML class diagram (using draw.io) included in zipped folder
