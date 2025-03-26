package functions;

import java.util.Scanner;

public class Functions {

    public static String greetUser(String name) {
        String message = "Welcome " + name.trim().toUpperCase();
        return message;
    }

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

    public static void main(String args[]) {

        // greeting user
        System.out.print("Enter your name:\t");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(greetUser(name));
        //
        //
        // Perform Arithmetic operations
        System.out.printf("Enter first num:\t");
        float num1 = sc.nextFloat();
        System.out.printf("Enter the operator:\t");
        String operator = sc.next();
        System.out.println("operator->>" + operator);
        System.out.printf("Enter second num:\t");
        float num2 = sc.nextFloat();
        float result = arithmeticOperation(num1, operator, num2);
        System.out.printf("The result of \t%.2f %s %.2f is:\t%.2f \n", num1, operator, num2, result);
    }
}
