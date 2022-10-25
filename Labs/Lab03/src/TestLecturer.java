// Q3

public class TestLecturer {

    public static void main (String[] args) {

        Book book1 = new Book("The Black Magician\t", 987, "Trudi Canavan\t", 30.00);
        Book book2 = new Book("A Song of Ice and Fire", 654, "George RR Martin", 80.00);
        Book book3 = new Book("Harry Potter\t\t\t", 321, "JK Rowling\t\t", 9.75);

        Lecturer lect1 = new Lecturer("Professor X\t", 10);
        //Lecturer lect2 = new Lecturer("James Bond\t", 007);

        BookList bookList1 = new BookList();

        bookList1.setMaxItems(3);
        bookList1.getMaxItems();
        bookList1.getNumItems();

        bookList1.add(book1);
        bookList1.add(book2);
        bookList1.add(book3);
        bookList1.getBookList();

        lect1.getName();
        lect1.getID();
        lect1.getBookList();

//        lect1.toString();
//        System.out.println(lect1);
//
//        bookList1.print();

        lect1.print();
        bookList1.print();
    }
}