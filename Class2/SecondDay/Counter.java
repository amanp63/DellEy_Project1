package SecondDay;

public class Counter {

	int count;

	Counter() {
		count++;
		System.out.println("Value of Count is" + count);
	}

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();

	}

}
