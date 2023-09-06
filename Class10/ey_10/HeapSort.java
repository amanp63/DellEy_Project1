package ey_10;

public class HeapSort {
    public static void main(String[] args) {
        int[] intArr = { 3, 60, 35, 0, 2, 24, 15 };

        System.out.println("Before Heap sort");

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
        heapSort(intArr);
        System.out.println();

        System.out.println("After Heap sort");
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    private static void heapSort(int[] intArr) {
        int n = intArr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(intArr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = intArr[0];
            intArr[0] = intArr[i];
            intArr[i] = temp;

            heapify(intArr, i, 0);
        }
    }

    static void heapify1(int[] intArr, int n, int i) {
        int largestElement = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && intArr[left] > intArr[largestElement]) {
            largestElement = left;
        }

        if (right < n && intArr[right] > intArr[largestElement]) {
            largestElement = right;
        }

        if (largestElement != i) {
            int swap = intArr[i];
            intArr[i] = intArr[largestElement];
            intArr[largestElement] = swap;

            heapify1(intArr, n, largestElement);
        }
    }
}