package ma4;

import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class q2 {
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
        System.out.println("\nPlease enter the file name of the file you would like to rename: ");
        String file_name = input.nextLine();
        File original_file = new File(file_name);
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss");
        String strDate = dateFormat.format(date);
        String ext = FilenameUtils.getExtension(file_name);
        if (original_file.exists()) {
            String new_file_name = FilenameUtils.removeExtension(file_name) + "_" + strDate + "." +ext;
            try {
                Files.move(original_file.toPath(), new File(new_file_name).toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException ex) {
                System.out.println("Error renaming file");
            }

            System.out.println(new_file_name);
        } else {
            System.out.println("This file does not exist.");
        }
    }
}
