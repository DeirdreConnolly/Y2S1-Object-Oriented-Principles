// Q3

public class Car {

    // Attributes
    private String make;
    private String model;
    private int year;
    private String price;
    private int age;
    private String desc;

    // Constructor -- same name as class, no return
    Car(String make, String model, int year, String price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Getters and Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void age() {
        age = (2018 - year);
    }

    public void printDetails() {
        this.age();

        // 1-3      shiny new
        // 6        slightly worn
        // 6-8      past its best
        // 8-10     showing signs of age
        // 10+      absolute banger

        if (age <= 3) {
            desc = "shiny new";
        } else if (age == 6) {
            desc = "slightly worn";
        } else if (age >= 6 && age <= 8) {
            desc = "past its best";
        } else if (age >= 8 && age <= 10) {
            desc = "showing signs of age";
        } else {
            desc = "an absolute banger";
        }

        System.out.println(make + " " +  model + " is " + age + " year(s) old, and is " + desc + ".");
    }
}
