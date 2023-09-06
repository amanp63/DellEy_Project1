package ey_9;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("hello word"); // once o(1)
		display();
	}

	static void display() {
		int n = 8;
		for (int i = 1; i < n; i++) {
			System.out.println("Hello World !!!\n"); // O(n)

		}
		for (int i = 1; i < n; i = i * 2) {
			System.out.println("Hello World !!!\n"); // O(log2(n))

		}
		for (int i = 2; i < n; i = (int) Math.pow(i, 2)) {
			System.out.println("Hello World !!!\n"); // O(log(log(n)))

		}
	}
}
