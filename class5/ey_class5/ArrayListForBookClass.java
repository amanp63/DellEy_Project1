package ey_class5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListForBookClass {

	public static void main(String[] args) {

		ArrayList<BookExample> arrayList = new ArrayList<>();

		BookExample b1 = new BookExample(1, "A", "B", "C", 10);
		BookExample b2 = new BookExample(1, "P", "Q", "R", 100);
		BookExample b3 = new BookExample(32, "M", "N", "Q", 1800);

		arrayList.add(b1);
		arrayList.add(b1);
		arrayList.add(b1);
		arrayList.add(b3);
		arrayList.add(b2);
		arrayList.add(b2);

		for (BookExample b : arrayList) {
			System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);
		}

		Iterator<BookExample> itr = arrayList.iterator();
		while (itr.hasNext()) {
			BookExample b = itr.next();
			System.out.println(b.bookId + " " + b.name + " " + b.publisher + " " + b.author + " " + b.quantity);
		}
	}

}
