package practice_for_test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class file_maker {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Please input the name of the type (p or m): ");
            String new_directory = "";
            String file_append = "";
            if (input.next().charAt(0) == 'p') {
                new_directory = "practical";
            } else if (input.next().charAt(0) == 'm') {
                new_directory = "ma";

            }
            System.out.println("Please enter the number: ");
            int number = input.nextInt();

            System.out.println("Please enter the number of files to be created: ");
            int number_of_files = input.nextInt();
            String full_path = "C:\\Users\\manni\\Documents\\ComputerScience\\College\\Semester 2\\30820 Java\\java_files\\src\\"+new_directory+number;
            Path path = Paths.get(full_path);

            //java.nio.file.Files;
            Files.createDirectories(path);

            System.out.println("Directory is created!");

            for (int i = 1; i <= number; i++) {
                File file_template = new File(full_path+"\\q"+i+".java");
                FileWriter myWriter = new FileWriter(full_path+"\\q"+i+".java");
                myWriter.write("package "+new_directory+number+";\n" +
                        "\n" +
                        "public class "+"q"+i+" {\n" +
                        "}\n");
                myWriter.close();
            }

        } catch (IOException e) {

            System.err.println("Failed to create directory!" + e.getMessage());

        }
    }
}

