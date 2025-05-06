package problem_solving_questions;

import java.util.*;

public class Problems {

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

    public static int sumOfArrayElements(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;
    }

    public static void averageOfPopulations() {
        Scanner inputPopulation = new Scanner(System.in);

        System.out.print("Enter population of #1 country:\t");
        int inputVal = inputPopulation.nextInt();
        int count = 0;
        int total = 0;
        float average = 0;
        while (inputVal > 0) {
            total += inputVal;
            count++;
            System.out.printf("Enter population of #%s country:\t", count + 1);
            inputVal = inputPopulation.nextInt();
        }
        average = total > 0 ? 1.0f * total / (count) : 0;
        System.out.println(count);
        System.out.println(total);
        System.out.printf("Average population is: \t%.2f", average);
    }

    public static void aboveAveragePop() {
        Scanner inputPopulation = new Scanner(System.in);
        ArrayList<Integer> populations = new ArrayList<>();
        System.out.print("Enter population of #1 country:\t");
        int inputVal = inputPopulation.nextInt();
        int total = 0;
        float average = 0;
        int aboveAveragePop = 0;
        while (inputVal > 0) {
            total += inputVal;
            populations.add(inputVal);
            System.out.print("Enter population of country:\t");
            inputVal = inputPopulation.nextInt();
        }
        if (total > 0) {
            average = 1.0f * total / (populations.size() - 1);
            System.out.printf("Average population is:\t%.2f\n", average);
            for (int i = 0; i < populations.size(); i++) {
                if (populations.get(i) > average) {
                    aboveAveragePop = populations.get(i);
                    System.out.println("Above averge population:\t" + aboveAveragePop);
                }
            }
        }
    }

    public static void print2dMatrix(int matrix[][], String text) {
        System.out.println(text);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // print transpose of matrix(2d array)
    public static void matrixTranspose(int nums[][]) {
        for (int i = 0; i < nums[i].length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[j][i] + "\t");
            }
            System.out.println();
        }
    }

    public static void arithmeticOperationsOnMatrix(int[][] matrix1, int[][] matrix2, String operator, String text) {
        System.out.println(text);
        int arithmeticResult = 0;
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                if (operator == "+") {
                    arithmeticResult = matrix1[i][j] + matrix2[i][j];
                } else if (operator == "*") {
                    arithmeticResult = matrix1[i][j] * matrix2[i][j];
                }
                System.out.print(arithmeticResult + "\t");
            }
            System.out.println();
        }
    }

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

    public static void splittedSentence(String sentence) {
        String word = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                if (word.length() > 0) {
                    System.out.println(word);
                }
                word = "";
            } else if (i == sentence.length() - 1 && sentence.charAt(i) != ' ') {
                word += sentence.charAt(i);
                System.out.println(word);
                word = "";
            } else
                word += sentence.charAt(i);
        }
    }

    public static int findLcm(int num1, int num2) {
        int greaterNum = 1;
        int lcm = 0;
        if (num1 < 1 || num2 < 1) {
            System.out.println("Number should not be less than 1");
        } else {
            if (num1 >= num2) {
                greaterNum = num1;
            } else {
                greaterNum = num2;
            }
            while (lcm == 0) {
                if (greaterNum % num1 == 0 && greaterNum % num2 == 0) {
                    lcm = greaterNum;
                    return lcm;
                } else {
                    greaterNum++;
                }
            }
        }
        return lcm;
    }

    public static int findHcf(int num1, int num2) {
        int biggerNum = 0;
        int hcf = 0;

        if (num1 < 1 || num2 < 1) {
            System.out.println("Number should not be less than 1");
        } else {
            if (num1 >= num2) {
                biggerNum = num1;
            } else {
                biggerNum = num2;
            }
            while (hcf != biggerNum) {
                if (num1 % biggerNum == 0 && num2 % biggerNum == 0) {
                    hcf = biggerNum;
                    return hcf;
                } else {
                    biggerNum--;
                }
            }
        }
        return hcf;
    }

    // find day of the week
    public static String findDayOfTheWeek(int dayOfTheWeek, int monthNum) {
        if (dayOfTheWeek > 31 || monthNum > 12) {
            return "Incorrect day or month";
        } else {
            String[] weekDays = { "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday" };
            int[] daysInEachMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            int i = 0;
            int totalDays = dayOfTheWeek;
            while (i < (monthNum - 1)) {
                totalDays += daysInEachMonth[i];
                i++;
            }

            int dayNum = totalDays % 7;
            String day = weekDays[dayNum];
            return "Day of the week is " + day;
        }
    }

    public static void giftVoucher() {
        Scanner sc = new Scanner(System.in);
        int giftVoucherAmount = 700;
        int purchaseAmount = 0;
        while (purchaseAmount < giftVoucherAmount) {
            System.out.printf("You have %d rupees left to utilize this voucher\n", giftVoucherAmount - purchaseAmount);
            System.out.print("Enter the amount of your product:\t");
            int productAmount = sc.nextInt();
            purchaseAmount += productAmount;
        }
        if (purchaseAmount > giftVoucherAmount) {
            System.out.printf("Your purchase amount, \"%d\" is greater than voucher amount, \"%d\"", purchaseAmount,
                    giftVoucherAmount);
        }
        if (purchaseAmount == giftVoucherAmount) {
            System.out.println("You have utilized your voucher");
        }
    }

    // twice of char num
    public static void twice_of_char_num() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer number:\t");
        String num = sc.next();
        int charOfNum = num.charAt(0) - 48;
        int twiceOfNum = charOfNum * charOfNum;
        System.out.println("The twice of the given number is: " + twiceOfNum);
    }

    public static void sum_of_string_as_int() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer value as string:\t");
        String input = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            int num = input.charAt(i) - 48;
            sum += num;
        }
        System.out.println("The sum of the given string value is: " + sum);
        sc.close();
    }

    public static void uppercase_to_lowercase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any single character in Upeercase:\t");
        String character = sc.next();
        int valOfGivenChar = character.charAt(0);
        char lowercaseLetter = (char) (valOfGivenChar + 32);
        System.out.println("Uppercase letter: " + character + "\nLowercase letter: " + lowercaseLetter);
        sc.close();
    }

    public static void greatest_sum_of_jagged_array_row(int[][] jagged_arr) {
        int greater_sum_row = 0;
        int greater_row_index = 0;
        for (int i = 0; i < jagged_arr.length; i++) {
            int temp_sum = 0;
            for (int j = 0; j < jagged_arr[i].length; j++) {
                temp_sum += jagged_arr[i][j];
            }
            if (temp_sum > greater_sum_row) {
                greater_sum_row = temp_sum;
                greater_row_index = i;
            }
        }
        System.out.printf("The row which has greater sum is %d and the sum of its elements is %d", greater_row_index,
                greater_sum_row);
    }

    public static void reverse_jagged_arr(int[][] jagged_arr) {
        for (int i = 0; i < jagged_arr.length; i++) {
            for (int j = jagged_arr[i].length - 1; j >= 0; j--) {
                System.out.print(jagged_arr[i][j] + "     ");
            }
            System.out.println();
        }
    }

    public static void print_user_inputted_array() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:\t");
        int size_of_arr = sc.nextInt();
        int[] numbers = new int[size_of_arr];
        for (int i = 0; i < size_of_arr; i++) {
            System.out.printf("Enter element#%d:\t", (i + 1));
            int element = sc.nextInt();
            numbers[i] = element;
        }
        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
        }
    }

    public static void main(String args[]) {
        // Scanner to take input
        Scanner sc = new Scanner(System.in);
        //
        //
        // // 1. print factorial of a given number
        // System.out.printf("Enter factorial number:\t");
        // int factorialNum = sc.nextInt();
        // System.out.println("Factorial of a given number is:\t" +
        // factorial(factorialNum));

        // // 2. to find sum of integers in an array
        // int[] integersArray = { 2, 50, 04, 9 };
        // System.out.println("Sum of the given array is: \t" +
        // sumOfArrayElements(integersArray));

        // 3. to find average of populations of countries
        // averageOfPopulations();

        // // 4. to find above average population of countries
        // aboveAveragePop();

        // // 5. matrix transpose(2d array)
        // int[][] nums = {
        // { 3, 2, 5 },
        // { 7, 64, 5 },
        // { 1, 3, 2 },
        // { 32, 4, 54 }
        // };
        // System.out.println("Matrix before transpose:");
        // print2dMatrix(nums, "");
        // System.out.println("Matrix after transpose:");
        // matrixTranspose(nums);

        int[][] matrix1 = { { 2, 1, 4 }, { 7, 5, 9 }, { 4, 2, 6 } };
        int[][] matrix2 = { { 7, 9, 1 }, { 17, 45, 69 }, { 24, 72, 06 } };
        // // 6. matrix addition
        // System.out.println("Matrices before addition");
        // print2dMatrix(matrix1, "Matrix 1=>");
        // print2dMatrix(matrix2, "Matrix 2=>");
        // arithmeticOperationsOnMatrix(matrix1, matrix2, "+", "Matrix after
        // addition:");

        // // 7. Matrix multiplication
        // System.out.println("Matrices before multiplication");
        // print2dMatrix(matrix1, "Matrix 1=>");
        // print2dMatrix(matrix2, "Matrix 2=>");
        // arithmeticOperationsOnMatrix(matrix1, matrix2, "*", "Matrix after
        // multiplication:");

        // // 8. Fibonacci Series [0,1,1,2,3,5,8,13]
        // System.out.print("Enter the length of fibonacci series:\t");
        // int lengthOfSeries = sc.nextInt();
        // sc.nextLine(); // for newline character
        // System.out.println("Fibonacci Series:\t" + fibonacciSeries(lengthOfSeries));

        // // 9. Split each word of sentence in new line (without using split method)
        // System.out.print("Enter any sentence:\t");
        // String sentence = sc.nextLine();
        // splittedSentence(sentence);

        // // 9. find LCM (least common multiple) of two given numbers;
        // System.out.print("Enter first number:\t");
        // int num1 = sc.nextInt();
        // System.out.print("Enter second number:\t");
        // int num2 = sc.nextInt();
        // System.out.println("Lcm of two given numbers is:\t" + findLcm(num1, num2));

        // // 10. find HCF (highest commong factor) or GCD (greatest common divisor)
        // System.out.print("Enter first number:\t");
        // int num1 = sc.nextInt();
        // System.out.print("Enter second number:\t");
        // int num2 = sc.nextInt();
        // System.out.println("HCF of two given numbers is:\t" + findHcf(num1, num2));

        // // 11. take the month and date as input and print day of the week (only for
        // 2025)
        // // "first january 2025 was on Wednesday"
        // System.out.print("Enter day of the month(In number):\t");
        // int dayOfMonth = sc.nextInt();
        // System.out.print("Enter number of the month(Like for March, it is 3rd
        // month):\t");
        // int monthNum = sc.nextInt();
        // System.out.println(findDayOfTheWeek(dayOfMonth, monthNum));

        // // 12. utilize gift voucher
        // giftVoucher();

        // // // 13. input one digit as string and print its twice(don't use integer
        // // conversion functions)
        // twice_of_char_num();

        // // 14. take input as integer number as string and print sum of all digits
        // // like("2030" = 2+0+3+0)
        // sum_of_string_as_int();

        // // 15. take one alphabet as input in uppercase and print its lowercase letter
        // uppercase_to_lowercase();

        // 16. find the row that has the maximum sum of its elements. Return the index
        // of that row.
        int[][] jagged_arr = {
                { 2, 3 },
                { 01, 5, 1, 7, 9 },
                { 12, 13, 4 },
                { 2, 3, 4 },
        };
        // greatest_sum_of_jagged_array_row(jagged_arr);

        // // 17. reverse the elements within each inner array (row).
        // reverse_jagged_arr(jagged_arr);

        // // 18. save array elements thorugh user input
        // print_user_inputted_array();
    }
}
