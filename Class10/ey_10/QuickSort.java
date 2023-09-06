package ey_10;

public class QuickSort {
    public static void main(String[] args) {
        int[] intArr = { 3, 60, 35, 0, 2, 24, 15 };
        int n = intArr.length;
        System.out.println("Before Quick sort");

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
        quickSort(intArr, 0, n - 1);
        System.out.println();

        System.out.println("After Quick sort");
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
    }

    private static int partition(int[] intArr, int startPosition, int endPosition) {
        int pivotElement = intArr[endPosition];
        int i = (startPosition - 1);

        for (int j = startPosition; j < endPosition; j++) {
            if (intArr[j] < pivotElement) {
                i++;
                int temp = intArr[i];
                intArr[i] = intArr[j];
                intArr[j] = temp;
            }
        }

        int temp = intArr[i + 1];
        intArr[i + 1] = intArr[endPosition];
        intArr[endPosition] = temp;

        return i + 1;
    }

    private static void quickSort(int[] intArr, int startElement, int endElement) {
        if (startElement < endElement) {
            int p = partition(intArr, startElement, endElement);
            quickSort(intArr, startElement, p - 1);
            quickSort(intArr, p + 1, endElement);
        }
    }
}