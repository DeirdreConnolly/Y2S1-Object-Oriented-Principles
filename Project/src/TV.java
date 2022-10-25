/**
 * Final Project
 *
 * @author Deirdre Connolly
 * @version Part 1, Question 3
 * <p>
 * A TV class. It will Inherit from the Product class.
 * It will have attributes for make, screen size, type (LCD, LED, Plasma) and whether or not it is 3D capable.
 * Write getters and setters.
 * Overload the print() method.
 */

public class TV extends Product {                                                // inherits from Product class

    // Attributes
    private String make;
    private int screenSize;
    private String type;
    private boolean triDi;  // tri-dimensional = 3D capability


    // Constructor
    public TV(String make, int screenSize, String type, boolean triDi, String name, String desc, double price) {
        super(name, desc, price);
        this.make = make;
        this.screenSize = screenSize;
        this.type = type;
        this.triDi = triDi;
    }


    // Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isTriDi() {
        return triDi;
    }

    public void setTriDi(boolean triDi) {
        this.triDi = triDi;
    }


    // Methods -- print, toString
    public void print() {
        super.print();                                                          // overwrites inherited print() method
        System.out.println("Make: " + make + "\n" +
                "Screen Size: " + screenSize + "inch" + "\n" +
                "Type: " + type + "\n" +
                "3D Capability: " + triDi);
    }

    public String toString() {
        print();
        return "";
    }
}