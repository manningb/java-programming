package practice_for_test_final;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ma4_1 {
    public static void main(String[] args) {
        try {
            File myFile = new File("input.txt");
            Scanner myRead = new Scanner(myFile);
            while (myRead.hasNextLine()) {
                System.out.println(myRead.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
