package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Recursion {

    // print backword counting from n
    public static void backwordCounting(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        backwordCounting(n - 1);
    }

    // print sum of n natural numbers
    public static int sumOfNaturalNums(int i, int n, int sum) {
        if (i == n) {
            return n;
        }
        sum += i + sumOfNaturalNums(i + 1, n, sum);
        System.out.println(i);
        return sum;
    }

    // Print the value of 'a' to the power of 'b'
    public static int calcPower(int base, int pow) {
        if (pow == 0) {
            return 1;
        }
        int calcPower = base * calcPower(base, pow - 1);
        return calcPower;
    }

    // print factorial of a given natural number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = factorial(n - 1);
        int result = n * fact;
        System.out.println(result);
        return result;
    }

    // print fibonacci series
    public static ArrayList<Integer> fibonacciSeries(int firstNum, int secondNum, int n,
            ArrayList<Integer> fibonacciList) {
        if (n == 0) {
            return fibonacciList;
        }
        int nextTerm = firstNum + secondNum;
        fibonacciList.add(nextTerm);
        fibonacciSeries(secondNum, nextTerm, n - 1, fibonacciList);
        return fibonacciList;
    }

    public static void main(String args[]) {
        // // 1. print backward counting
        // backwordCounting(5);

        // // 2. print sum of natural numbers
        // int sum = sumOfNaturalNums(2, 5, 0);
        // System.out.println("Sum of given natural numbers is: " + sum);

        // // 3. print factorial of a given number
        // int callFactorial = factorial(4);
        // System.out.println(callFactorial);

        // // 4. Print the value of 'a' to the power of 'b'
        // int power = calcPower(4, 3);
        // System.out.println(power);

        // 5. print fibonacci series
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> fibonaccilist = new ArrayList<>();
        System.out.print("Enter nth term of fibonacci series:\t");
        int nthTerm = sc.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        fibonaccilist.add(firstNum);
        fibonaccilist.add(secondNum);
        ArrayList<Integer> callFibonacci = fibonacciSeries(firstNum, secondNum, nthTerm - 2, fibonaccilist);
        System.out.println(callFibonacci);
    }
}
