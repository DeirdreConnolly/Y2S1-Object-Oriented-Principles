/**
 * Final Project
 *
 * @author Deirdre Connolly
 * @version Part 1, Question 2
 * <p>
 * A Phone class. It will Inherit from the Product class.
 * It will have attributes for make (Apple, Motorola, Samsung, etc), model (iPhone 6, Moto X, Galaxy S5, etc), and storage space (in gigabytes).
 * Write getters and setters.
 * Overload the print() method that's inherited from the Product class. Make use of the super.print() call.
 */

public class Phone extends Product {                                            // inherits from Product class

    // Attributes
    private String make;
    private String model;
    private int storage;


    // Constructor
    public Phone(String make, String model, int storage, String name, String desc, double price) {
        super(name, desc, price);
        this.make = make;
        this.model = model;
        this.storage = storage;
    }


    // Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }


    // Methods -- print
    public void print() {
        super.print();                                                          // overwrites inherited print() method
        System.out.println("Make: " + make + "\n" +
                "Model: " + model + "\n" +
                "Storage: " + storage + "GB" + "\n");
    }
}