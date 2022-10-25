import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Final Project
 *
 * @author Deirdre Connolly
 * @version Part 1, Question 7 & Part 3
 * <p>
 * Write a Test class that instantiates a number of phones and TVs and sets their attributes.
 * Create some Customer objects.
 * Create a ProductDB object.
 * Add all your products to the object.
 * Create some Order objects for a given Customer, and add some orders to that Customer object.
 */

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu = 0;

        Customer Arya = new Customer("Arya", "Winterfell");
        Customer Harry = new Customer("Harry", "Godric's Hollow");

        ArrayList<Order> orderList = new ArrayList<Order>();
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Phone p1 = new Phone("Google", "Pixel 3 XL", 128, "Google Phone", "A new way to see the world", 600);
        Phone p2 = new Phone("Samsung", "Note 9", 512, "Samsung Phone", "The new super powerful Note", 900);
        TV p3 = new TV("LG", 52, "LED", true, "LG TV", "4k for all your viewing needs", 1200);

        ProductDB db = new ProductDB();

        db.add(p1);
        db.add(p2);
        db.add(p3);

        do {
            do {
                try {
                    System.out.println("\n~~~~~~~~~~ MENU ~~~~~~~~~~\n" +
                            "1. Create a new phone\n" +
                            "2. Create a new customer\n" +
                            "3. Search for a product by supplying the product ID\n" +
                            "4. Display all products in the db\n" +
                            "5. Allow a customer to order some products\n" +
                            "6. Display all orders that a customer has made and all the products that are in a given order\n" +
                            "7. Display all orders for a given product by supplying the product ID\n" +
                            "8. Quit");
                    System.out.println("Selection >>> ");
                    menu = scan.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("ERROR: Please choose an option from the menu.");
                    scan.nextLine();
                }

            } while (menu <= 0);     // -1

            switch (menu) {

                case 1:
                    // Create a new phone
                    int phoneStorage = -1;
                    double phonePrice = -1;

                    System.out.println("\nPhone Make: ");
                    String phoneMake = scan.next();

                    System.out.println("\nPhone Model: ");
                    String phoneModel = scan.next();

                    do {
                        try {
                            System.out.println("\nPhone Storage: ");
                            phoneStorage = scan.nextInt();

                        } catch (InputMismatchException e) {
                            System.out.println("ERROR: Please enter a positive whole number.");
                            scan.nextLine();
                        }

                    } while (phoneStorage <= 0);

                    System.out.println("\nPhone Name: ");
                    String phoneName = scan.next();

                    System.out.println("\nPhone Description: ");
                    String phoneDesc = scan.next();

                    do {
                        try {
                            System.out.println("\nPhone Price: ");
                            phonePrice = scan.nextDouble();

                        } catch (InputMismatchException e) {
                            System.out.println("ERROR: Please enter a positive whole number.");
                            scan.nextLine();
                        }

                    } while (phonePrice <= 0);

                    Phone newPhone = new Phone(phoneMake, phoneModel, phoneStorage, phoneName, phoneDesc, phonePrice);
                    db.add(newPhone);
                    //System.out.println("\n");
                    break;

                case 2:
                    // Create a new customer
                    System.out.println("\nCustomer Name: ");
                    String customerName = scan.next();
                    System.out.println("\nCustomer Address: ");
                    String customerAddress = scan.next();

                    Customer newCust = new Customer(customerName, customerAddress);
                    customerList.add(newCust);
                    break;

                case 3:
                    // Search for a product by supplying the product ID
                    int searchAns = -1;

                    do {
                        try {
                            System.out.println("\nProduct ID: ");
                            searchAns = scan.nextInt();

                        } catch (InputMismatchException e) {
                            System.out.println("ERROR: Please enter a positive whole number.");
                            scan.nextLine();
                        }

                        if (searchAns > db.getProductDBSize()) {
                            System.out.println("ERROR: There is no product match for given ID.");
                            searchAns = 0;
                        }

                    } while (searchAns <= 0);

                    db.find(searchAns);
                    System.out.println("\n");

                    if ((db.find(searchAns) != null)) {
                        System.out.println(db.find(searchAns));
                    } else {
                        System.out.println("ERROR: There is no product match for given ID.");
                    }
                    break;

                case 4:
                    // Display all products in the database
                    System.out.println("\n~~~~~~ Products Listed in Database ~~~~~~");
                    db.print();
                    break;

                case 5: // ??
                    // Allow a customer to order some products
                    boolean loopCon = true;
                    int conAns = -2;
                    int customerPick = -2;
                    int orderID = -2;
                    int numOfItemsOrdered = -2;

                    do {
                        do {
                            try {
                                System.out.println("\nPress 1 to continue." +
                                        "\nPress -1 at any time to exit.");
                                conAns = scan.nextInt();

                            } catch (InputMismatchException e) {
                                System.out.println("ERROR: Please enter a positive whole number.");
                                scan.nextLine();
                            }

                        } while (conAns <= -2);

                        if (conAns == -1) {
                            loopCon = false;
                            break;
                        }


                        // Print all customers in db
                        do {
                            try {
                                System.out.println("\nSelect Customer:");
                                for (int i = 0; i < customerList.size(); i++) {
                                    System.out.println(i + ". " + customerList.get(i));
                                }

                                customerPick = scan.nextInt();

                            } catch (InputMismatchException e) {
                                System.out.println("ERROR: Please enter a positive whole number.");
                                scan.nextLine();
                            }

                            if (customerPick > customerList.size() - 1) {
                                System.out.println("ERROR: There is no customer match for given ID.");
                                customerPick = -2;
                            }

                        } while (customerPick <= -2);

                        if (customerPick == -1) {
                            loopCon = false;
                            break;
                        }


                        // Numbers matching to customer names
                        do {
                            try {
                                System.out.println("\nProduct ID: ");
                                orderID = scan.nextInt();

                            } catch (InputMismatchException e) {
                                System.out.println("ERROR: Please enter a positive whole number.");
                                scan.nextLine();
                            }

                            if (orderID > db.getProductDBSize()) {
                                System.out.println("ERROR: There is no product with that ID number");
                                orderID = 0;
                            }


                        } while (orderID <= -2 || orderID == 0);

                        if (orderID == -1) {
                            loopCon = false;
                            break;
                        }

                        Product x = new Product();
                        x = db.find(orderID);


                        // Getting quantity of items
                        do {
                            try {
                                System.out.println("\nQuantity: ");
                                numOfItemsOrdered = scan.nextInt();

                            } catch (InputMismatchException e) {
                                System.out.println("ERROR: Please enter a positive whole number.");
                                scan.nextLine();
                            }

                        } while (numOfItemsOrdered == 0 || numOfItemsOrdered <= -2);

                        if (numOfItemsOrdered == -1) {
                            loopCon = false;
                            break;
                        }

                        Order o = new Order(x, numOfItemsOrdered);

                        // Matches customer object when you get their index
                        Customer placeHolder = customerList.get(customerPick);
                        placeHolder.addOrder(o);
                        orderList.add(o);

                        // Ask to loop
                    } while (loopCon == true);
                    break;

                case 6:
                    // Display all orders that a customer has made, and all the products that are in a given order
                    loopCon = true;
                    customerPick = -1;

                    do {
                        try {
                            // Print all customers
                            System.out.println("\nSelect Customer:");
                            for (int i = 0; i < customerList.size(); i++) {
                                System.out.println(i + ". " + customerList.get(i));
                            }

                            customerPick = scan.nextInt();

                        } catch (InputMismatchException e) {
                            System.out.println("ERROR: Please enter a positive whole number.");
                            scan.nextLine();
                        }

                        if (customerPick > customerList.size() - 1) {
                            System.out.println("ERROR: There is no customer match for given ID.");
                            customerPick = -2;
                        }

                    } while (customerPick <= -1);

                    Customer placeHolder = customerList.get(customerPick);
                    System.out.println("\n" + customerList.get(customerPick) + " has ordered: ");
                    placeHolder.printOrders();
                    break;

                case 7:
                    // Display all orders for a given product by supplying the product ID
                    int i = 0;
                    int case7Ans = 0;

                    do {
                        try {
                            System.out.println("\nProduct ID: ");
                            case7Ans = scan.nextInt();

                        } catch (InputMismatchException e) {
                            System.out.println("ERROR: Please enter a positive whole number.");
                            scan.nextLine();
                        }

                        if (case7Ans > db.getProductDBSize()) {
                            System.out.println("ERROR: There is no product match for given ID.");
                            case7Ans = 0;
                        }

                    } while (case7Ans <= 0);

                    for (Order x : orderList) {
                        if (x.getOrderItem().getProductID() == case7Ans) {
                            orderList.get(i).printProductOrders(case7Ans);
                            i++;
                        } else i++;
                    }
                    break;

                case 8:
                    // Quit
                    System.out.println("Thank you, please come again.");
                    break;
            }

        } while (menu != 8);
        scan.close();
    }
}