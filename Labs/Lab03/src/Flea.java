// Q2

public class Flea
{
    // Attributes
    private String name;
    private int age;
    private Dog myDog;                                                      // add instance variable of the second type??


    // Constructor -- same name as class, no return
    public Flea(){                                                          // Constructor Overloading
    }                                                                       // A class can have multiple constructors,
                                                                            // as long as their signature (the parameters they take)
    public Flea(String name, int age, Dog dog) {                            // are not the same.
        this.name = name;
        this.age = age;
        this.myDog = dog;
        this.setMyDog(dog);
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

    public Dog getMyDog() {
        return myDog;
    }

    public void setMyDog(Dog myDog) {
        this.myDog = myDog;
    }


    //toString Method
    public String toString() {
        return this.name + " " + this.age;
    }
}