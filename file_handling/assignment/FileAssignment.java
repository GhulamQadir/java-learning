package assignment;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileAssignment {
    public static void readFile() {
        String file_path = "../SalesData-2025-Mor.txt";
        File myFile = new File(file_path);
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
            System.out.println("End of the file has reached");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // print all the fields extracted from the line
    public static void printFields() {
        String path = "../SalesData-2025-Mor.txt";
        File myFile = new File(path);
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String[] line = sc.nextLine().split("        ");
                for (int i = 0; i < line.length; i++) {
                    System.out.print(line[i] + "      ");
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getTotalOfEachItem() {
        String file_path = "../SalesData-2025-Mor.txt";
        File myFile = new File(file_path);
        try {
            Scanner sc = new Scanner(myFile);
            int i = 0;
            int grand_total = 0;
            while (sc.hasNextLine()) {
                String[] line = sc.nextLine().split("        ");
                for (int j = 0; j < line.length; j++) {
                    System.out.print(line[j] + "        ");
                }
                if (i > 0) {
                    int price = Integer.parseInt(line[2]);
                    int quantity = Integer.parseInt(line[3]);
                    int total = quantity * price;
                    System.out.print(total);
                    grand_total += total;
                } else {
                    System.out.print("Total");
                }
                System.out.println();
                i++;
            }
            System.out.println("Your grand total is: " + grand_total);
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Display monthwise sales
    public static void display_MonthWise_Sales() {
        ArrayList<Integer> months = new ArrayList<>();
        ArrayList<int[]> months_sales = new ArrayList<>();
        String file_path = "../SalesData-2025-Mor.txt";
        File myFile = new File(file_path);
        try {
            Scanner sc = new Scanner(myFile);
            int count = 0;
            while (sc.hasNextLine()) {
                String[] line = sc.nextLine().split("        ");

                if (count > 0) { // count > 0, so that headings will not be added in array

                    // saving months with sales(quantity x unitPrice in a separate array)
                    String[] date = line[4].split("");
                    int month = Integer.parseInt(date[0]);
                    int price = Integer.parseInt(line[2]);
                    int quantity = Integer.parseInt(line[3]);
                    int total = quantity * price;
                    int[] temp = { month, total };
                    months_sales.add(temp);

                    // separating different months and saving them into array
                    boolean monthFound = false;
                    for (int i = 0; i < months.size(); i++) {
                        if (months.get(i).equals(month)) {
                            monthFound = true;
                        }
                    }

                    // if month not found in the array, then add that unique month
                    if (!monthFound) {
                        months.add(month);
                    }
                }

                // incrementing count value for the next iteration check
                count++;
            }

            // after saving separate unique months in an array and months with sales in
            // different array, calculating total sales for the unique months like
            // calculating total sales for the month 6,7 and so on
            int[][] totalMonthsSales = new int[months.size()][2];
            for (int y = 0; y < months.size(); y++) {
                int total = 0;
                for (int z = 0; z < months_sales.size(); z++) {
                    if (months.get(y) == months_sales.get(z)[0]) {
                        total += months_sales.get(z)[1];
                    }
                }

                // saving month with its total sale in a new different array
                int[] temp = { months.get(y), total };
                totalMonthsSales[y] = temp;
            }

            // printing months with total sales
            for (int i = 0; i < totalMonthsSales.length; i++) {
                System.out.println("Month: " + totalMonthsSales[i][0] + "       Sales: " + totalMonthsSales[i][1]);
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        // readFile();

        // // Suppose the line that you read from the file contains TAB delimited data
        // // how to convert that line into fields.
        // printFields();

        // // Write code that prints the amount that the buyer has to pay for the item
        // // described in the line.
        // getTotalOfEachItem();

        // display monthwise sales
        display_MonthWise_Sales();

    }
}
