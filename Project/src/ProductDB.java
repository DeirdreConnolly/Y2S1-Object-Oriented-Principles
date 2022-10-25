import java.util.ArrayList;

/**
 * Final Project
 *
 * @author Deirdre Connolly
 * @version Part 1, Question 4
 * <p>
 * Write a ProductDB class which manages an ArrayList of Products.
 * The class provides methods to add, remove and find a product.
 * The find method returns a product with a matching productID.
 */

public class ProductDB<P> {

    // Attributes
    private ArrayList<Product> productList = new ArrayList<Product>();
    private int numItems = 0;


    // Constructor
    public ProductDB() {
        this.numItems = 0;
    }


    // Getters and Setters
    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public int getNumItems() {
        return numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }

    public Product getProduct(int i) {
        Product g = productList.get(i);
        return g;
    }

    public int getProductDBSize() {
        return productList.size();
    }


    // Methods -- add, remove, find product (find method returns product with matching productID)
    public void add(Product i) {
        this.productList.add(i);
        this.numItems++;
    }

    public void remove(int productID) {
        Product res = null;

        for (int q = 0; q < productList.size(); q++) {
            if (((Product) this.getProduct(q)).getProductID() == productID) {

                productList.remove((Product) this.getProduct(q));
                numItems--;
            }
        }
    }

    public Product find(int productID) {
        Product res = null;

        for (int q = 0; q < productList.size(); q++) {
            if (((Product) this.getProduct(q)).getProductID() == productID) {
                res = (Product) this.getProduct(q);
            }
        }
        return res;
    }

    public void print() {
        for (Product x : productList) {
            ((Product) x).print();
        }
    }
}