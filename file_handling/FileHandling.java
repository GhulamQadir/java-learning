import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FileHandling {
    public static void main(String args[]) {
        // // code to create a new file
        // String file_path = "test-file.txt";
        // File myFile = new File(file_path);
        // try {
        // myFile.createNewFile();
        // } catch (Exception e) {
        // e.printStackTrace(); // prints error to in the terminal
        // }

        // // Writing in a file
        // try {
        // FileWriter fileWriter = new FileWriter(file_path, true);
        // fileWriter.write("faisal");
        // fileWriter.write(System.lineSeparator());
        // fileWriter.close();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // reading lines from file
        String file_path = "SalesData-2025-Mor.txt";
        File myFile = new File(file_path);
        String[] line = new String[6];

        try {
            Scanner sc = new Scanner(myFile);
            int i = 0;
            System.out.println("Unit Price  Quantity Total");
            while (sc.hasNextLine()) {
                line = sc.nextLine().split("        ");
                if (i > 0) {
                    int uP = Integer.parseInt(line[2]);
                    int q = Integer.parseInt(line[3]);
                    int total = uP * q;
                    System.out.println(uP + "\t\t" + q + "\t" + total);
                }
                i = i + 1;
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
