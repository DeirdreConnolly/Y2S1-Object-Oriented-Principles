// Q1+2

import java.util.ArrayList;

public class Dog {

    // Attributes
    private String name;
    private int age;
    private String address;
    private ArrayList<Flea> myFleas = new ArrayList<Flea>(20);


    // Constructor -- same name as class, no return
    public Dog(){                                                           // Constructor Overloading
    }                                                                       // A class can have multiple constructors,
                                                                            // as long as their signature (the parameters they take)
    public Dog(String name, int age, String address) {                      // are not the same.
        this.name = name;
        this.age = age;
        this.address = address;
    }


    // Methods
    public void bark()  {                                                   // this is cast in TestObjectList
        System.out.println("Bark!");
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Flea> getMyFleas() {
        return myFleas;
    }

    public void setMyFleas(Flea flea) {
        myFleas.add(flea);
    }

    //toString Method
    public String toString() {
        return this.name + " has the fleas: " + myFleas;
    }
}