package lecturer_examples.lecture18;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class stream_test {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        String currentDir = "C:/Users/manni/Documents/ComputerScience/College/Semester 2/30820 Java/java_files/src/lecturer_examples/lecture18/";
        try {
            in = new FileInputStream(currentDir+"input.txt");
            out = new FileOutputStream(currentDir+"output.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
