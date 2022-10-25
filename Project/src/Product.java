//import java.util.concurrent.ThreadLocalRandom;

/**
 * Final Project
 *
 * @author Deirdre Connolly
 * @version Part 1, Question 1
 * <p>
 * A Product class. This will be a generic class for Products that a company may sell.
 * It will have attributes for the following: name, description, price and productID.
 * Use appropriate data types.
 * Write getters and setters for all attributes.
 * Write a method called print() that prints the Product information to the screen.
 * A unique productID is assigned to the product when it is created. You can use a static int to achieve this.
 */

public class Product {

    // Attributes
    private String name;
    private String desc;
    private double price;
    private int productID;
    //int productID_random = ThreadLocalRandom.current().nextInt(1, 99);
    private static int counter = 0;


    // Constructor
    public Product() {

    }

    public Product(String name, String desc, double price) {    // incl productID??
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.productID = counter;
        counter++;
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }


    // Methods -- print
    public void print() {
        System.out.println("Name: " + name + "\n" +
                "Description: " + desc + "\n" +
                "Price: €" + price + "\n" +
                "Product ID: " + productID);
    }
}