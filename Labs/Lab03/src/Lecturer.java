// Q3

public class Lecturer {

    // Attributes
    private String name;
    private int ID;
    private BookList books;                                                           // BookList is a subclass of ObjectList
    private int MAXNUMOFBOOKS = 15;                                                   // capital letters for constants


    // Constructor -- same name as class, no return
    Lecturer(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public BookList getBookList() {
        return books;
    }


    // toString Method
//    public String toString() {
//        return "Lecturer: " + this.name +
//                "\nStaff ID: " + this.ID +
//                "\nBooks Borrowed: " + this.books;
//    }

    public void print() {
        System.out.println( "Lecturer: " + this.name +
                            "\nStaff ID: " + this.ID +
                            "\nBooks Borrowed: " + this.books);
    }
}