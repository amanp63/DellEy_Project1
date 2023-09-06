package ey_10;

public class SwapElements {
	public static void main(String[] args) {

		int[] intArr = { 3, 60, 35, 0, 2, 24, 15, 34 };
		System.out.println("Elements Before Swapping");
		for (int i : intArr) {
			System.out.println(i + " ");
		}

		System.out.println();

		int firstIndex = 2, secondIndex = 4;

		int temp = intArr[firstIndex];
		intArr[firstIndex] = intArr[secondIndex];
		intArr[secondIndex] = temp;

		System.out.println("After swapping");

		for (int i : intArr) {
			System.out.println(i + " ");
		}
	}
}
