package ey_class5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hMap = new HashMap<>();
		
		hMap.put(123, "ABC");
		hMap.put(123, null);
		hMap.put(123, null);
		hMap.put(123, "PQR");
		hMap.put(123, "XYZ");
		hMap.put(123, "MNO");
		
		for(Map.Entry<Integer, String> m: hMap.entrySet()) {
			System.out.println(m.getKey()+ " : "+ m.getValue());
		}
	}

}
