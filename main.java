import java.util.*;
import java.text.DecimalFormat;

public class main {
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

        // // take input population of countries and print their average
        // Scanner inputPopulation = new Scanner(System.in);
        // int inputVal = 1;
        // int count = 0;
        // int total = 0;
        // float average = 0;
        // while (inputVal > 0) {
        // System.out.print("Enter population of countries: ");
        // inputVal = inputPopulation.nextInt();
        // total += inputVal;
        // count++;
        // }
        // inputPopulation.close(); // scanner closed
        // DecimalFormat df = new DecimalFormat("#.##");
        // average = 1.0f * total / (count - 1);
        // System.out.println(count);
        // System.out.println(total);
        // System.out.println("Average population is: " + df.format(average));

        // // to find above average population
        // Scanner inputPopulation = new Scanner(System.in);
        // ArrayList<Integer> populations = new ArrayList<>();
        // int total = 0;
        // int inputVal = 1;
        // float average = 0;
        // int aboveAveragePop = 0;
        // while (inputVal > 0) {
        // System.out.print("Enter population of country:\t");
        // inputVal = inputPopulation.nextInt();
        // total += inputVal;
        // populations.add(inputVal);
        // }
        // inputPopulation.close(); // scanner closed
        // average = 1.0f * total / (populations.size() - 1);
        // System.out.printf("Average population is:\t%.2f\n", average);
        // for (int i = 0; i < populations.size() - 1; i++) {
        // if (populations.get(i) > average) {
        // aboveAveragePop = populations.get(i);
        // System.out.println("Above averge population:\t" + aboveAveragePop);
        // }
        // }
        // // above average program ended here

        // PYRAMID PATTERNS
        // // first pattern
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.printf("%3d", j);
        // }
        // System.out.println();
        // }

        // // 2nd pattern
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 3rd pattern
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
