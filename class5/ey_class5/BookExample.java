package ey_class5;

public class BookExample implements Comparable<BookExample> {
    int bookId;
    String author, publisher, name;
    int quantity;

    public BookExample(int bookId, String author, String publisher, String name, int quantity) {
        // TODO Auto-generated constructor stub
        this.bookId = bookId;
        this.author = author;
        this.publisher = publisher;
        this.name = name;
        this.quantity = quantity;
    }

    public int compareTo(BookExample o) {
        if (this.bookId < o.bookId) {
            return -1;
        } else if (this.bookId > o.bookId) {
            return 1;
        } else {
            return 0;
        }
    }
}