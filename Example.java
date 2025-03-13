import java.text.DecimalFormat;
import java.util.*;

public class Example {
    public static void main(String args[]) {
        // int a = 32;
        // System.out.println(a);

        // // to find sum of integers in an array
        // int[] numbers = { 3, 2, 43, 55 };
        // System.out.println(Arrays.toString(numbers));

        // int sum = 0;
        // for (int i = 0; i < numbers.length; i++) {
        // sum += numbers[i];
        // }
        // System.out.println("Value after addition is: " + sum);

        // take input population of countries and print their average
        Scanner inputPopulation = new Scanner(System.in);
        int inputVal = 1;
        int count = 0;
        int total = 0;
        float average = 0;
        while (inputVal > 0) {
            System.out.print("Enter population of countries: ");
            inputVal = inputPopulation.nextInt();
            total += inputVal;
            count++;
        }
        DecimalFormat df = new DecimalFormat("#.##");
        average = 1.0f * total / (count - 1);
        System.out.println(count);
        System.out.println(total);
        System.out.println("Average of population is: " + df.format(average));
    }
}