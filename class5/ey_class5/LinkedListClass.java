package ey_class5;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("A");
		list.add("A");
		list.add("A");

		list.add(null);
		list.add(null);
		list.add(null);
		list.add("Z");
		list.add("X");
		list.add("Y");
		list.add("B");

		list.addFirst("First element");
		list.addLast("Last element");

		Object firstelement = list.getFirst();
		System.out.println("First element is " + firstelement);

		Object lastelement = list.getLast();
		System.out.println("First element is " + lastelement);

		int position = list.indexOf("Z");

		System.out.println("Position of Z is" + position);
		int lastpositionOfA = list.indexOf("A");
		System.out.println("Position of last A is" + lastpositionOfA);

		list.add(0, "Added element at the zeroyh index");
		list.remove(2);

		list.removeFirstOccurrence("A");
		list.removeLastOccurrence("A");

		Object o = list.poll();
		Object o2 = list.pollLast();

		// Iterator<String> itr = list.iterator();
		// while (itr.hasNext()) {
		// System.out.println(itr.next()+ "");

		ListIterator<String> listItr = list.listIterator();
		while (listItr.hasNext()) {
			System.out.println(listItr.next() + "");

		}
		System.out.println();
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous() + "");

		}
	}
}
