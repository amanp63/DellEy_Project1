package ey_class5;

import java.util.Iterator;

import java.util.LinkedList;

public class LinkedListClassBook {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		LinkedList<BookExample> list = new LinkedList<>();

		BookExample b1 = new BookExample(1, "Aman", "dell", "Book1", 10);

		BookExample b2 = new BookExample(12, "Rana", "dell", "Book2", 100);

		BookExample b3 = new BookExample(31, "RAJA", "dell", "book3", 800);

		list.add(b1);

		list.add(b2);

		list.add(b3);

		Iterator<BookExample> itr = list.iterator();

		while (itr.hasNext()) {

			BookExample b = itr.next();

			System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);

		}

	}
}