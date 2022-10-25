// Q3

public class Book {

    // Attributes
    private String title;
    private int ISBN;
    private String author;
    private double price;


    // Constructor -- same name as class, no return
    Book(String title, int ISBN, String author, double price) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.price = price;
    }


    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    //toString Method
    public String toString() {
        return  "Title: " + this.title +
                "\tISBN: " + this.ISBN +
                "\tAuthor: " + this.author +
                "\tPrice: €" + this.price;
    }
}