package advance_algorithms;

import java.util.Arrays;

public class Algorithms {
    public static void inPlaceSortingAlgo() {
        int[] num_arr = { 54, 78, 98, 43, 22, 41, 7, 9, 4, 25, 59 };
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

    public static void main(String args[]) {
        // in-place sorting OR Selection sorting
        inPlaceSortingAlgo();
    }
}
