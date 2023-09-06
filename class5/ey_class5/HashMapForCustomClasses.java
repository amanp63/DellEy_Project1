package ey_class5;
import java.util.HashMap;

public class HashMapForCustomClasses {
    public static void main(String[] args) {
        // Create instances of the BookExample class
        Book b1 = new Book("ISBN1", "Title 1", "Author 1", "Publisher 1", 5);
        Book b2 = new Book("ISBN2", "Title 2", "Author 2", "Publisher 2", 3);
        Book b3 = new Book("ISBN3", "Title 3", "Author 3", "Publisher 3", 7);

        // Create a HashMap to store the books
        HashMap<String, Book> bookMap = new HashMap<>();

        // Add books to the HashMap
        bookMap.put(b1.getIsbn(), b1);
        bookMap.put(b2.getIsbn(), b2);
        bookMap.put(b3.getIsbn(), b3);

        // Print the contents of the HashMap
        for (String isbn : bookMap.keySet()) {
            Book book = bookMap.get(isbn);
            System.out.println("ISBN: " + isbn +
                    ", Title: " + book.getTitle() +
                    ", Author: " + book.getAuthor() +
                    ", Publisher: " + book.getPublisher() +
                    ", Quantity: " + book.getQuantity());
        }
    }
}

class BookEx {
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private int quantity;

    public BookEx(String isbn, String title, String author, String publisher, int quantity) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getQuantity() {
        return quantity;
    }
}