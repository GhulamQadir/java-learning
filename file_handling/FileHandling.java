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
        // FileWriter fileWriter = new FileWriter(file_path);
        // fileWriter.write("Learning file handling in java\nfile handling in java\nfile
        // handling in java");
        // fileWriter.close();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // reading lines from file
        String file_path = "SalesData-2025-Mor.txt";
        File myFile = new File(file_path);
        String line = "";

        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
