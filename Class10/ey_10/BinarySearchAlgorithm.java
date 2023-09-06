package ey_10;

public class BinarySearchAlgorithm {
	public static void main(String[] args) {

		int[] intArr = { 10, 32, 2, 7, 67, 8, 4 };

		int lookOutFor = 8;

		int index = binarySearch(intArr, lookOutFor);

		if (index == -1) {
			System.out.println("Element " + lookOutFor + " not found in the array.");
		} else {
			System.out.println("Element " + lookOutFor + " found at index " + index);
		}
	}

	static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				left = mid + 1; 
			} else {
				right = mid - 1; 
			}
		}

		return 0; 
	}
}