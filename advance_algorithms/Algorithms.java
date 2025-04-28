package advance_algorithms;

import java.util.Arrays;

public class Algorithms {
    public static void inPlaceSortingAlgo(int[] num_arr) {
        for (int i = 0; i < num_arr.length - 1; i++) {
            int smallestNum = num_arr[i];
            int placeToSwap = i;
            for (int j = i + 1; j < num_arr.length - 1; j++) {
                if (smallestNum > num_arr[j]) {
                    smallestNum = num_arr[j];
                    placeToSwap = j;
                }
            }
            num_arr[placeToSwap] = num_arr[i];
            num_arr[i] = smallestNum;
        }
        System.out.println("Sorted Array:\t" + Arrays.toString(num_arr));
    }

    // bubble sorting algorithm
    public static int[] bubbleSortingAlgo(int[] num_arr) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < num_arr.length - 1; i++) {
                if (num_arr[i] > num_arr[i + 1]) {
                    int temp = num_arr[i + 1];
                    num_arr[i + 1] = num_arr[i];
                    num_arr[i] = temp;
                    sorted = false;
                }
            }
        }
        return num_arr;
    }

    public static void binarySearch(int[] num_arr) {
        int[] sorted_arr = bubbleSortingAlgo(num_arr);
        System.out.println(Arrays.toString(sorted_arr));
        boolean elementFound = false;
        int num_to_find = 9;
        int start = 0;
        int end = sorted_arr.length - 1;
        while (start <= end && (!elementFound)) {
            int mid = (start + end) / 2;
            if (num_to_find == sorted_arr[mid]) {
                System.out.print("Your element is at index: " + mid);
                elementFound = true;
            } else if (num_to_find > sorted_arr[mid]) {
                start = mid + 1;
            } else if (num_to_find < sorted_arr[mid]) {
                end = mid - 1;
            }
        }
        if (!elementFound) {
            System.out.println("Element not found");
        }
    }

    public static void main(String args[]) {
        int[] num_arr = { 54, 78, 98, 43, 22, 41, 7, 9, 4, 25, 59, 723 };
        // in-place sorting OR Selection sorting
        inPlaceSortingAlgo(num_arr);

        // // bubble sorting
        // int[] bubble_sorted_array = bubbleSortingAlgo(num_arr);
        // System.out.println("Sorted Array: " + Arrays.toString(bubble_sorted_array));

        // // binary searching (Rule: Array have to be sorted)
        // binarySearch(num_arr);

    }
}
