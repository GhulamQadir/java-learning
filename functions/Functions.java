package functions;

import java.util.*;

public class Functions {

    public static String greetUser(String name) {
        // greet user function
        String message = "Welcome " + name.trim().toUpperCase();
        return message;
    }

    // arithmetic operation function
    public static float arithmeticOperation(float num1, String operator, float num2) {
        if (operator.equals("+")) {
            return num1 + num2;
        } else if (operator.equals("-")) {
            return num1 - num2;
        } else if (operator.equals("*")) {
            return num1 * num2;
        } else if (operator.equals("/")) {
            return num1 / num2;
        }
        return 0;
    }

    // function to print factorial of a given number
    public static long factorial(int num) {
        if (num < 0) {
            System.out.println("Invalid number");
            return 0;
        } else {
            long factorial = 1;
            int factorialNum = num;
            for (int i = factorialNum; i > 1; i--) {
                factorial *= i;
            }
            return factorial;
        }
    }

    // program to print fibonacci series of given length [0,1,1,2,3,5,8]
    public static ArrayList<Integer> fibonacciSeries(int length) {
        ArrayList<Integer> seriesList = new ArrayList<>();
        if (length < 1) {
            System.out.println("Invalid length");
        } else {
            for (int i = 0; i < length; i++) {
                if (i > 1) {
                    int prevSum = seriesList.get(i - 1) + seriesList.get(i - 2);
                    seriesList.add(prevSum);
                } else {
                    seriesList.add(i);
                }
            }
        }
        return seriesList;
    }

    public static void main(String args[]) {

        // // greeting user
        // System.out.print("Enter your name:\t");
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(greetUser(name));
        // //
        // //
        // // Perform Arithmetic operations
        // System.out.printf("Enter first num:\t");
        // float num1 = sc.nextFloat();
        // System.out.printf("Enter the operator:\t");
        // String operator = sc.next();
        // System.out.println("operator->>" + operator);
        // System.out.printf("Enter second num:\t");
        // float num2 = sc.nextFloat();
        // float result = arithmeticOperation(num1, operator, num2);
        // System.out.printf("The result of \t%.2f %s %.2f is:\t%.2f \n", num1,
        // operator, num2, result);
        //
        //
        // print factorial of a given number
        System.out.printf("Enter factorial number:\t");
        int factorialNum = sc.nextInt();
        System.out.println("Factorial of a given number is:\t" + factorial(factorialNum));
        //
        //
        // print fibonacci series [0,1,1,2,3,5]
        System.out.print("Enter the length of fibonacci series:\t");
        int fibonacciSeriesLength = sc.nextInt();
        System.out.println("Fibonacci Series:\t" + fibonacciSeries(fibonacciSeriesLength));
    }
}
