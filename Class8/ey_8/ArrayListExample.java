package ey_8;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		Integer[] intArr = new Integer[2];
		intArr[0] = 10;
		intArr[1] = 20;
		
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(intArr));
		
		Iterator<Integer> itr =arrayList.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next()+ " ");
		}
			Integer integer = (Integer) itr.next();
			
		}

}
