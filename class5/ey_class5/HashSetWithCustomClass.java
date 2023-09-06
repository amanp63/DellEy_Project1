package ey_class5;

import java.util.Iterator;

import java.util.TreeSet;

public class HashSetWithCustomClass {
	public static void main(String[] args) {
		TreeSet<BookExample> treeSet = new TreeSet<>();

		BookExample b1 = new BookExample(1, "Aman", "dell", "Book1", 10);

		BookExample b2 = new BookExample(12, "Rana", "dell", "Book2", 100);

		BookExample b3 = new BookExample(31, "RAJA", "dell", "book3", 800);

		treeSet.add(b3);
		treeSet.add(b2);
		treeSet.add(b1);

		Iterator<BookExample> itr = treeSet.iterator();

		while (itr.hasNext()) {

			BookExample b = itr.next();

			System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);
		}

	}
}
