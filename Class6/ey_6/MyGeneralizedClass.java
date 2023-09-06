package ey_6;

import java.util.ArrayList;
import java.util.List;

public class MyGeneralizedClass<T> {
	private List<T> items = new ArrayList<>();

	public void add(T item) {
		items.add(item);
	}

	public T get() {
		if (items.isEmpty()) {
			return null;
		}
		return items.get(items.size() - 1);
	}

	public class UseOfGenerics {
		public static void main(String[] args) {
			MyGeneralizedClass<Integer> intType = new MyGeneralizedClass<>();
			intType.add(21);
			intType.add(31);

			System.out.println(intType.get());

			MyGeneralizedClass<String> strType = new MyGeneralizedClass<>();
			strType.add("ABC");

			System.out.println(strType.get());

			MyGeneralizedClass<Boolean> boolType = new MyGeneralizedClass<>();
			boolType.add(true);

			System.out.println(boolType.get());
		}
	}
}