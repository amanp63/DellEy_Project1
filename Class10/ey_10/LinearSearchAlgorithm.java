package ey_10;

import java.util.Arrays; // Import Arrays class for toString method

public class LinearSearchAlgorithm {
	
	public static void main(String[] args) {
		
		int[] intArr = {10, 3, 5, 6, 20};
		
		int lengthOfArray = intArr.length;
		
		int searchElement = 6;
		
		int index = searchProgram(intArr, lengthOfArray, searchElement);
		
		if (index == -1) {
			System.out.println("Element " + searchElement + " is not present in array " + Arrays.toString(intArr));
		} else {
			System.out.println("Element " + searchElement + " found at index " + index);
		}
	}

	static int searchProgram(int[] intArr, int lengthOfArray, int searchElement) {
		for (int i = 0; i < lengthOfArray; i++) {
			if (intArr[i] == searchElement) { // Compare with searchElement instead of element
				return i;
			}
		}
		return -1;
	}
}