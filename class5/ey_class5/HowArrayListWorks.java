package ey_class5;

import java.util.ArrayList;
import java.util.Iterator;

public class HowArrayListWorks {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("A");
		arrList.add("A");
		arrList.add("A");
		arrList.add("A");

		arrList.add(null);
		arrList.add(null);
		arrList.add(null);
		arrList.add("Z");
		arrList.add("X");
		arrList.add("Y");
		arrList.add("B");
		
		Iterator<String> itr = arrList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}

		ArrayList<String> arrList2 = new ArrayList<String>();
		arrList2.add("P");
		arrList2.add("P");
		arrList2.add("Q");

		arrList.addAll(arrList2);

		System.out.println("Size of array list is" + arrList.size());
		arrList.remove("A");

		arrList.removeAll(arrList2);

		arrList.set(1, "New Second Element");

		arrList.retainAll(arrList2);

		

		arrList.clear();
		
		for(String str:arrList) {
			System.out.println(str + " ");
		}

	}

}
