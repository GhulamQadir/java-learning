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
    public static void bubbleSortingAlgo(int[] num_arr) {
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
        System.out.println("Sorted Array:\t" + Arrays.toString(num_arr));
    }

    public static void main(String args[]) {
        int[] num_arr = { 54, 78, 98, 43, 22, 41, 7, 9, 4, 25, 59 };

        // // in-place sorting OR Selection sorting
        // inPlaceSortingAlgo(num_arr);

        // bubble sorting
        bubbleSortingAlgo(num_arr);
    }
}
