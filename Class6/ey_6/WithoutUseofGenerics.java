package ey_6;

import java.util.ArrayList;
import java.util.Iterator;

public class WithoutUseofGenerics {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add("ABC");
		arrayList.add(123);
		
		String str =(String) arrayList.get(0);
		Integer intData = (Integer)arrayList.get(1);
		
		Iterator itr = arrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+ " ");
		}
		
		
		
	}

}
