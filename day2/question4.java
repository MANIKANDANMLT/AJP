package lab2;

import java.util.ArrayList;

class Book {
    int bookid;
    String bookname;
    String authorname;
    Book(int bookid, String bookname, String authorname) {
        this.bookid = bookid; 
        this.bookname = bookname; 
        this.authorname = authorname; 
    }
}
public class question4 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "Book1", "Author1"));
        books.add(new Book(2, "Book2", "Author2"));
        books.add(new Book(3, "Book3", "Author3"));

        for (Book book : books) {
            System.out.println("Book ID: " + book.bookid);
            System.out.println("Book Name: " + book.bookname);
            System.out.println("Author Name: " + book.authorname);
            System.out.println(); // Add a blank line for better readability
        }
    }
}
