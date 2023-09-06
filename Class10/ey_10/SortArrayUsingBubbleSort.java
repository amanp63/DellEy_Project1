package ey_10;

public class SortArrayUsingBubbleSort {
    public static void main(String[] args) {

        int[] intArr = {3, 60, 35, 0, 2, 24, 15};

        System.out.println("Before Bubble sort");

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
        bubbleSort(intArr);
        System.out.println();

        System.out.println("After Bubble sort");
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
    }

    static void bubbleSort(int[] intArr) {
        int lengthArray = intArr.length;
        int tempArr = 0;

        for (int i = 0; i < lengthArray; i++) {
            for (int j = 1; j < lengthArray - i; j++) {
                if (intArr[j - 1] > intArr[j]) {
                    tempArr = intArr[j - 1];
                    intArr[j - 1] = intArr[j];
                    intArr[j] = tempArr;
                }
            }
        }
    }
}