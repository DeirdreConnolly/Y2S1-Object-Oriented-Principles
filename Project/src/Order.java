/**
 * Final Project
 *
 * @author Deirdre Connolly
 * @version Part 1, Question 5
 * <p>
 * Write an Order class which manages an ArrayList of Products.
 */

public class Order {

    // Attributes
    private Product orderItem;
    private int quantity;
    private int orderNum;
    private static int orderCount = 0;


    // Constructor
    public Order(Product p, int quantity) {
        orderCount++;
        this.orderItem = p;
        this.quantity = quantity;
        this.orderNum = orderCount;
    }


    // Getters and Setters
    public Product getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(Product orderItem) {
        this.orderItem = orderItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public static int getOrderCount() {
        return orderCount;
    }

    public static void setOrderCount(int orderCount) {
        Order.orderCount = orderCount;
    }


    // Methods -- add, print
    public void printProductOrders(int productID) {

        if ((this.orderItem).getProductID() == productID) {
            System.out.println("Order Number: " + orderNum + "\n" +
                    "Item: " + orderItem.getName() + "\n" +
                    "Quantity: " + quantity);
        }
    }

    public Product add(Product x, int quantity) {
        //this.numItems++;
        return x;
    }

    public void print() {
        System.out.println("Item: " + orderItem.getName() + "\n" +
                "Quantity: " + quantity);
    }
}