package advance_algorithms;

import java.util.Arrays;

public class Algorithms {
    public static void inPlaceSortingAlgo(int[] num_arr) {
        for (int i = 0; i < num_arr.length; i++) {
            int smallestNum = num_arr[i];
            for (int j = i; j < num_arr.length; j++) {
                if (smallestNum >= num_arr[j]) {
                    smallestNum = num_arr[j];
                    num_arr[j] = num_arr[i];
                    num_arr[i] = smallestNum;
                }
            }
            num_arr[i] = smallestNum;
        }
        System.out.println("Sorted Array:\t" + Arrays.toString(num_arr));
    }

    // bubble sorting algorithm
    public static int[] bubbleSortingAlgo(int[] num_arr) {
        for (int i = 0; i < num_arr.length; i++) {
            for (int j = 0; j < num_arr.length - 1; j++) {
                int left_element = num_arr[j];
                int right_element = num_arr[j + 1];
                if (left_element > right_element) {
                    int temp_num = left_element;
                    num_arr[j] = right_element;
                    num_arr[j + 1] = left_element;
                    left_element = right_element;
                    right_element = temp_num;
                }
            }
        }
        return num_arr;
    }

    public static void binarySearch(int[] num_arr) {
        int[] sorted_arr = bubbleSortingAlgo(num_arr);
        System.out.println(Arrays.toString(sorted_arr));
        boolean elementFound = false;
        int num_to_find = 78;
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

        // // in-place sorting OR Selection sorting
        // inPlaceSortingAlgo(num_arr);

        // // bubble sorting
        // int[] bubble_sorted_array = bubbleSortingAlgo(num_arr);
        // System.out.println("Sorted Array: " + Arrays.toString(bubble_sorted_array));

        // binary searching (Rule: Array have to be sorted)
        binarySearch(num_arr);

    }
}

// // binary searching (Rule: Array has to be sorted)
// int[] sorted_arr = { 4, 7, 22, 32, 36, 39, 40, 42, 77, 89, 99, 101 };
// boolean elementFound = false;
// int num_to_find = 39;
// int low = 0; // Initialize the lower bound of the search
// int high = sorted_arr.length - 1; // Initialize the upper bound of the search
// int middleElement = -1; // Initialize middleElement to an invalid index

// while (low <= high && !elementFound) {
// middleElement = low + (high - low) / 2; // Calculate the middle index

// System.out.println("Checking middle element at index: " + middleElement + ",
// value: " + sorted_arr[middleElement]); // For demonstration

// if (sorted_arr[middleElement] == num_to_find) {
// System.out.print("Your element is at index: " + middleElement);
// elementFound = true;
// } else if (sorted_arr[middleElement] > num_to_find) {
// // If the middle element is greater than the target,
// // the target must be in the left half of the array.
// high = middleElement - 1; // Adjust the upper bound to search the left half
// System.out.println("Target is smaller, searching in the left half (high = " +
// high + ")"); // For demonstration
// } else { // sorted_arr[middleElement] < num_to_find
// // If the middle element is less than the target,
// // the target must be in the right half of the array.
// low = middleElement + 1; // Adjust the lower bound to search the right half
// System.out.println("Target is larger, searching in the right half (low = " +
// low + ")"); // For demonstration
// }
// }

// if (!elementFound) {
// System.out.println("Element is not present in array");
// }