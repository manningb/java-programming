package ma4;

import java.io.*;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FileInputStream in = null;
        File current_dir = new File(System.getProperty("user.dir"));
        String[] pathnames;
        pathnames = current_dir.list();
        System.out.println("The current directory has the following files: ");
        for (String pathname : pathnames) {
            // Print the names of files and directories
            System.out.println("\t- "+ pathname);
        }

        System.out.println("\nPlease enter the file name of the file you would like to analyse: ");
        String file_name = input.nextLine();
        int count_lines = 0;
        int count_words = 0;
        int count_char = 0;
        try {
            File f = new File(file_name);
            Scanner file_in = new Scanner(f);
            while (file_in.hasNextLine()) {
                String line = file_in.nextLine();
                count_lines += 1;
                count_words += line.split(" ").length;
                count_char += line.length();
            }
            System.out.println("\nFile " + file_name + " has:");
            System.out.println("Number of lines: " + count_lines);
            System.out.println("Number of words: " + count_words);
            System.out.println("Number of chars: " + count_char);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
