package practice_for_test;

import java.util.Scanner;

public class p3q4 {
    public static void main(String[] args) {
        String string1 = lineInput("Please enter the first string: ");
        String string2 = lineInput("Please enter the second string: ");
        int smaller_length = Math.min(string1.length(), string2.length());
        boolean check = false;
        for (int i = 0; i < smaller_length; i++) {
            char c_1 = string1.charAt(i);
            char c_2 = string2.charAt(i);
            if (c_1 == c_2) {
                System.out.print(c_1);
                check = true;
        }
        }
        if (!check) {
            System.out.println("no common prefix");
        }
    }
    private static String lineInput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

}
