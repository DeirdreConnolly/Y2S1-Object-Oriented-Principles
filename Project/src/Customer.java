import java.util.ArrayList;

/**
 * Final Project
 *
 * @author Deirdre Connolly
 * @version Part 1, Question 6
 * <p>
 * Write a Customer class that has attributes name, address.
 * A Customer object also has an ArrayList of Orders.
 */

public class Customer {

    // Attributes
    private String name;
    private String address;
    private ArrayList<Order> orderList = new ArrayList<Order>();


    // Constructor
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    // Methods -- add, print, toString
    public void addOrder(Order i) {
        this.orderList.add(i);
    }

    public void printOrders() {
        for (Order x : orderList) {
            x.print();
        }
    }

    public String toString() {
        return name;
    }
}